package topic7;

import java.util.ArrayList;

public class ITECCourse {
    // fields
    private String name;
    private int code;
    private ArrayList<String> students;
    private int max;

    // constructor
    public ITECCourse(String courseName, int classCode, int maxStudents) {
        name = courseName;
        code = classCode;
        max = maxStudents;
        students = new ArrayList<>();
    }

    // methods - they must have return type
    public void addStudent(String studentName) {
        if (students.size() == max) {
            System.out.println("Course is full, can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    public void writeCourseInfo() {
        System.out.println("Course Name : " + name);
        System.out.println("Course Code : " + code);
        System.out.println("Students Enrolled:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students that can enroll in this course is " + max);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + name);
        } else {
            System.out.println(studentName + " was not found in " + name);
        }
    }

    // to generate getter or setter - alt + insert (on Windows)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) { // add some if statement
        if (max < 0) {
            return; // ignore and don't change the value
        }
        this.max = max;
    }
}
