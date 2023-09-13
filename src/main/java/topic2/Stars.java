package topic2;

public class Stars {
    public static void main(String[] args) {

        // display a square of *
        int size = 5;

        // the outer loop prints one row per loop repeat
        for (int x = 0; x < size; x++) {

            // inner for loop. for each row, print a star 5 times in one line
            for (int y = 0; y < size; y++) {
                System.out.print("*");
            }

            // move to the next line
            System.out.println();
        }
    }
}
