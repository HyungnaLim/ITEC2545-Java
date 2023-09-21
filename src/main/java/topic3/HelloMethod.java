package topic3;

import static input.InputUtils.stringInput;

public class HelloMethod {

    //  This is the main method - the first code to run
    public static void main(String[] args) {

        String name = stringInput("Please Enter your name");
        String greeting = makeGreeting(name);
        System.out.println(greeting);

    }

    // This makeGreeting method takes one argument, a String.
    // It will create a new greeting String and return it.
    public static String /* Return type must be specified. if nothing to return, use void */
    makeGreeting(String n /* arguments need a type and a name, separate with commas */ ) {
        // method body starts and ends with {}
        String greeting = "Hello " + n + "!";
        return greeting; // return statement. needed if the method specifies a return type

    }

}
