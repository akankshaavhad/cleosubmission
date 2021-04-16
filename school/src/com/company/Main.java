package com.company;

public class Main {
    /*
    1)	Create classes that encapsulate and model a school.  This school has many teachers, students, and course offerings.  Consider the following:

-	It is a small school, so each course has only one offering per semester.  The course is identified by a unique key of course ID, year, and semester.  For example:  "MATH101"  "2016"  "Fall"
-	Each teacher is assigned to teach one or more course offerings.
-	Each course offering has many students.
-	Each student can take multiple courses, for which they will have grade.

After implementing the model school, write functions for the following:
•	For a given course offering, return the teacher
•	For a given student and course offering, return the grade
•	For a given student, year, and semester, return a grade point average (ex: 3.49)
•	For a given student, year, and semester, return a list of courses and the grades that the given student received in those courses
     */

    public static void main(String[] args) {
	School school = new School();
	Course math = new Course("MATH101", "2016", "Fall");
    Course english = new Course("ENG101", "2016", "Fall");
    Course science = new Course("SCI101", "2015", "Spring");
	Teacher kaka = new Teacher("Kaka");
	kaka.getCourseOfferings().add(math);
	Student udit = new Student("Udit");
	Student akki = new Student("Akki");

    }
}
