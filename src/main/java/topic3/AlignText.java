package topic3;

public class AlignText {
    public static void main(String[] args) {
        // set arrays for class codes and class names
        int[] classCode = {2545, 2505, 2560};
        String[] className = {"Java", "C#", "Web"};
        double[] averagesize = {22.34233, 17.2352, 14.31232};

        // set a template with string formatting for table header
        // - sign aligns text left, numbers mean how many spaces for the text
        String templateString = "%-10s%-10s%-10s\n";
        System.out.printf(templateString, "Code", "Name", "Average Size");

        // set a template for table
        String tableTemplateString = "%-10d%-10s%-10.1f\n";
        // set a for loop to print out everything in the array
        for (int i = 0; i < className.length; i++) {
            int code = classCode[i];
            String name = className[i];
            double size = averagesize[i];
            // print code and name in one line, and add a new line for next line
            System.out.printf(tableTemplateString, code, name, size);
        }
    }
}
