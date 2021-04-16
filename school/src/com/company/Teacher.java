package com.company;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    String teacherName;
    List<Course> courseOfferings;


    public Teacher(String teacherName) {
        this.teacherName = teacherName;
        this.courseOfferings = new ArrayList<>();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<Course> getCourseOfferings() {
        return courseOfferings;
    }

    public void setCourseOfferings(List<Course> courseOfferings) {
        this.courseOfferings = courseOfferings;
    }
}
