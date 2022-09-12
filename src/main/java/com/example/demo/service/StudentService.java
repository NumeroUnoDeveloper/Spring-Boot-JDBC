package com.example.demo.service;


import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao dao;

    public void getAllStudents(){
        List<Student> list = dao.getAllStudents();
        list.stream().forEach( (st)-> System.out.println(st));
    }

    public void AddStudents(){
        dao.insertStudent(new Student("1","Ana", "One"));
        dao.insertStudent(new Student("2","Bob", "Two"));
        dao.insertStudent(new Student("3","Claire", "One"));
    }
}
