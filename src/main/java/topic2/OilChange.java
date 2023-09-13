package topic2;

public class OilChange {
    public static void main(String[] args) {

        // print mileages every 3000 miles from 150000 mile for 8 oil change
        int mileage = 150000;
        int interval = 3000;

        for (int oilChange = 0; oilChange<8; oilChange++) {
            mileage = mileage + interval;
            System.out.println("Get oil change at " + mileage + " miles");
        }

//        another solution
//        for (int miles = mileage; miles < (mileage + 8 * interval); miles = miles + interval) {
//            System.out.println("Get oil change at " + miles + " miles");
//        }

    }
}
