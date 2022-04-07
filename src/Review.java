
public class Review {

    public static void main(String []args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getProductOfAll(arr));
        System.out.println(findMin(10, 11));
        countToZero(10);

    }

    public static int findMin(int a, int b) {
        if (a > b) return b;
        return a;
    }

    public static void countToZero(int timer) {
        if (timer < 0) {
            System.out.println("sorry");
        }
        else {
            do {
                System.out.println(timer);
                timer--;
            }
            while (timer >= 0);
        }
    }

    public static int getProductOfAll(int[] arr) {
        int product = arr[0];
        for (int i = 1; i < arr.length; i++) {
            product*=arr[i];
        }
        return product;
    }

    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum / arr.length;
    }

    public static class Apartment {
        private int numBathrooms;
        private int numBedrooms;
        private double monthlyRent;

        public Apartment() {
            numBathrooms = 1;
            numBedrooms = 2;
            monthlyRent = 1000.50;
        }

        public int getNumBathrooms() {
            return numBathrooms;
        }

        public void setNumBathrooms(int numBathrooms) {
            this.numBathrooms = numBathrooms;
        }

        public int getNumBedrooms() {
            return numBedrooms;
        }

        public void setNumBedrooms(int numBedrooms) {
            this.numBedrooms = numBedrooms;
        }

        public double getMonthlyRent() {
            return monthlyRent;
        }

        public void setMonthlyRent(double monthlyRent) {
            this.monthlyRent = monthlyRent;
        }
    }


}
