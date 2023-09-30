package topic4;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(10); // 0-9
        int randomNumberBetween1and10 = rnd.nextInt(10) + 1; // 1-10
        System.out.println(randomNumber + " " + randomNumberBetween1and10);

    }
}
