package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String studentName;

    List<Course> studentCourses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.studentCourses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Course> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(List<Course> studentCourses) {
        this.studentCourses = studentCourses;
    }
}
