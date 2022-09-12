package com.example.demo.model;


public class Student {


    private String student_id;
    private String name;
    private String grade;

    public Student(){

    }
    public Student( String student_id, String name, String grade) {
        this.student_id = student_id;
        this.name = name;
        this.grade = grade;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}