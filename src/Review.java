
public class Review {

    public static void main(String []args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getProductOfAll(arr));
        System.out.println(findMin(10, 11));
        countToZero(10);
        happyNewYear(10);
        reverseString("Hello");
        System.out.println("Is Hannah a palindrome: " + isPalindrome("Hannah"));

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

    public static void happyNewYear(int timer) {
        for (int i = timer; i > 0; --i) {
            if (i % 2 == 1) {
                System.out.println("OUU! " + i);
            }
            else {
                System.out.println("AAA! " + i);
            }
        }
        System.out.println("Happy New Year!");
    }

    public static void reverseString(String string) {
        String newString = "";
        for (int i = string.length()-1; i >= 0; i--) {
            newString+=string.charAt(i);
        }
        System.out.println(newString);
    }

    public static boolean isPalindrome(String string) {
        String newString1 = "";
        String newString2 = "";
        int j = string.length()-1;
        for (int i = 0; i < j; i++) {
            newString1+=string.charAt(i);
            newString2+=string.charAt(j);
            if (!newString1.equalsIgnoreCase(newString2)) return false;
            j--;
        }
        return true;
    }

    public static class House {
        private int numWindows;
        private String ownerName;
        private boolean hasStairs;

        public House() {
            numWindows = 6;
            ownerName = "";
            hasStairs = false;
        }

        public House(int numWindows, String ownerName, boolean hasStairs) {
            this.numWindows = numWindows;
            this.ownerName = ownerName;
            this.hasStairs = hasStairs;
        }

        public int getNumWindows() {
            return numWindows;
        }

        public void setNumWindows(int numWindows) {
            this.numWindows = numWindows;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public boolean isHasStairs() {
            return hasStairs;
        }

        public void setHasStairs(boolean hasStairs) {
            this.hasStairs = hasStairs;
        }
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
