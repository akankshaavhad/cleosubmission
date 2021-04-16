package com.company;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> studentList;
    List<Teacher> teacherList;
    List<Course> offerings;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Course> getOfferings() {
        return offerings;
    }

    public void setOfferings(List<Course> offerings) {
        this.offerings = offerings;
    }

    //For a given course offering, return the teacher
    public List<Teacher> getTeacherByCourseOffering(Course course) {
        List<Teacher> allTeachers = getTeacherList();
        List<Teacher> teachersForCourseList = new ArrayList<>();

        for(Teacher eachTeacher: allTeachers) {
            if(eachTeacher.getCourseOfferings().contains(course)) {
                teachersForCourseList.add(eachTeacher);
            }
        }
        return teachersForCourseList;
    }

    //•	For a given student and course offering, return the grade
    public String getGradeByStudentCourse(Student student, Course course) {
        List<Course> studentCourses = student.getStudentCourses();

        if(studentCourses.contains(course)) {
            Course studentCourse = studentCourses.get(studentCourses.indexOf(course));
            return studentCourse.getGrade();
        }

        return "Student " + student.getStudentName() + " has not opted for " + course.courseId;
    }

    //For a given student, year, and semester, return a grade point average (ex: 3.49)
    public float getGradePointAverage(Student student, String year, String semester) {
        float totalGrade = 0;
        int totalCourses = 0;
        List<Course> studentCourses = student.getStudentCourses();

        for(Course course: studentCourses) {
            if(course.getCourseYear().equals(year) && course.getCourseSemester().equals(semester)) {
              totalGrade +=  Float.parseFloat(course.getGrade());
              totalCourses++;
            }
        }
        return totalGrade/totalCourses;
    }

    //For a given student, year, and semester, return a list of courses
    // and the grades that the given student received in those courses

    public List<Course> getStudentCoursesAndGrade(Student student, String year, String semester) {
        List<Course> studentCourses = student.getStudentCourses();
        List<Course> resultList = new ArrayList<>();

        for(Course course: studentCourses) {
            if(course.getCourseYear().equals(year) && course.getCourseSemester().equals(semester)) {
               resultList.add(course);
            }
        }
        return resultList;
    }

}
