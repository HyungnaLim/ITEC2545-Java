package topic2;

public class ArrayExample {
    public static void main(String[] args) {

        // example int array
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 100;
//        numbers[5] = 3; not a valid index. Array index starts at 0, so the last item is array size -1

        String[] classNames = new String[3];
        classNames[0] = "Java";
        classNames[1] = "C#";
        classNames[2] = "Web";
        System.out.println("You should take " + classNames[1] + " class to graduate.");

        // create array with {}
        String[] animmals = { "cat", "dog", "bird" };
        System.out.println("My favorite animal is " + animmals[0]);

        String[] classrooms = {"T3010", "T3020", "T3030", "T3040", "T3050", "T3080"};
        // how many elements in the array? .length method
        int numberOfClassrooms = classrooms.length;
        System.out.println("There are " + numberOfClassrooms + " classrooms.");

    }
}
