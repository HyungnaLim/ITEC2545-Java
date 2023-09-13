package topic2;

public class ForLoops {
    public static void main(String[] args) {
        // count 1,2,3,4,5
        for (int x=1; x<6; x++) {
            System.out.println(x);
        }

        // countdown 10 to 0 for rocket launch
        for (int x=10; x>=0; x--) {
            System.out.println(x + "...");
        }
        System.out.println("Rocket Launch!!");
    }
}
