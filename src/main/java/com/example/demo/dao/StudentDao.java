package com.example.demo.dao;

import com.example.demo.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentDao.class);

    public Student findStudentById(String studentId){
        Student st = null;
        String sql = "Select * from student where student_id = ?";
        try{
            st = jdbcTemplate.queryForObject(sql,Student.class);
        }catch (Exception ex){
            LOGGER.info("Student for given Id is not found");
        }
        return st;
    }

    public List<Student> getAllStudents(){
        String sql = "Select * from student ";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
    }

    public int insertStudent(Student st){
        String sql = "insert into student values (?,?,?)";
        return jdbcTemplate.update(sql, st.getStudent_id(), st.getName(), st.getGrade());
    }
}
