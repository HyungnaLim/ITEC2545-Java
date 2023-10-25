package topic7;

public class ITECCourseManager {

    public static void main(String[] args) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer System Maintenance", 1310, 20);

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communication", 1425, 30);

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse softwareCourse = new ITECCourse("Software Development Project", 2903, 24);

        softwareCourse.addStudent("Gus");
        softwareCourse.addStudent("Harry");
        softwareCourse.addStudent("Izzy");

        int total = softwareCourse.getNumberOfStudents();
        System.out.println(softwareCourse.name + " class has " + total + " students");

        // access to the variable value
        System.out.println("ITEC " + softwareCourse.code + " " + softwareCourse.name);

        // modifying variable value
        softwareCourse.max = 30;
        softwareCourse.writeCourseInfo();

        maintenanceCourse.removeStudent("Carl");
        maintenanceCourse.removeStudent("Martha");

        ITECCourse smallCourse = new ITECCourse("Made up course", 1234, 3);
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Miriam");
        smallCourse.removeStudent("Kirby");
        smallCourse.addStudent("Nita");
        smallCourse.writeCourseInfo();

    }

}
