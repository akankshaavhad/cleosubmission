package com.company;

import java.util.List;

public class Course {

    String courseId;
    String courseYear;
    String courseSemester;
    String grade;
    List<Student> students;

    public Course(String courseId, String courseYear, String courseSemester) {
        this.courseId = courseId;
        this.courseYear = courseYear;
        this.courseSemester = courseSemester;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(String courseYear) {
        this.courseYear = courseYear;
    }

    public String getCourseSemester() {
        return courseSemester;
    }

    public void setCourseSemester(String courseSemester) {
        this.courseSemester = courseSemester;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
