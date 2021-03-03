package com.example.demo.entity.student;

public class Student {
    public Integer getStudentid() {
        return studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    private final Integer studentid;
    private final String studentName;

    public Student(Integer studentid, String studentName) {
        this.studentid = studentid;
        this.studentName = studentName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
