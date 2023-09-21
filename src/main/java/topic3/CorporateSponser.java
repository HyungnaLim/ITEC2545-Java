package topic3;

import java.util.Arrays;

public class CorporateSponser {
    public static void main(String[] args) {

        String[] sponsers = {"ikea", "at&t", "cvs", "3m"};

        for (int i=0; i < sponsers.length; i++) {
            sponsers[i] = sponsers[i].toUpperCase();
            System.out.println(sponsers[i]);    // print each spring in each line
        }

        System.out.println(Arrays.toString(sponsers));  // print with array [] in one line
    }
}
