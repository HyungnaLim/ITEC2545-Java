package topic7;

import java.util.ArrayList;

public class ITECCourse {
    // fields
    String name;
    int code;
    ArrayList<String> students;
    int max;

    // constructor
    ITECCourse(String courseName, int classCode, int maxStudents) {
        name = courseName;
        code = classCode;
        max = maxStudents;
        students = new ArrayList<>();
    }

    // methods - they must have return type
    void addStudent(String studentName) {
        if (students.size() == max) {
            System.out.println("Course is full, can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    void writeCourseInfo() {
        System.out.println("Course Name : " + name);
        System.out.println("Course Code : " + code);
        System.out.println("Students Enrolled:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students that can enroll in this course is " + max);
    }

    int getNumberOfStudents() {
        return students.size();
    }

    void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + name);
        } else {
            System.out.println(studentName + " was not found in " + name);
        }
    }



}
