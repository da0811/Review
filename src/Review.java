import sun.lwawt.macosx.CSystemTray;

public class Review {

    public static void main(String[] args) {

//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(getProductOfAll(arr));
//        System.out.println(findMin(10, 11));
//        countToZero(10);
//        happyNewYear(10);
//        reverseString("Hello");
        String word = "saippuakivikauppias"; // Finnish word meaning soapstone vendor
        String word2 = "civic";
        String word3 = "David";
        String word4 = "Hannah";
        System.out.println("Is " + word + " a palindrome: " + isPalindrome(word));
        System.out.println("Is " + word2 + " a palindrome: " + isPalindrome(word2));
        System.out.println("Is " + word3 + " a palindrome: " + isPalindrome(word3));
        System.out.println("Is " + word4 + " a palindrome: " + isPalindrome(word4));

        House house1 = new House(6, "Hulk", true);
        House house2 = new House(6, "Spider-man", false);

        System.out.println(charSearch("David", 'x'));

        reverseString("David");

        Insect caterpillar = new Insect(10, false, 4, "Caterpillar", true);
        Insect butterfly = new Insect(4, true, 2, "Butterfly", false);

        Insect bug1 = new Insect();
        Insect bug2 = new Insect();
        Insect bug3 = new Insect();

        caterpillar.setMoving(false);
        butterfly.setMoving(true);

        Insect[] bugs = {bug1, bug2, bug3, caterpillar, butterfly};

        for (int i = 0; i < bugs.length; i++) {
            System.out.println(bugs[i].getCommonName());
        }

        bug1.setCommonName("bug1");

        System.out.println(bugs[0].getCommonName());
    }

    public static class Insect {
        private int numLegs;
        private boolean hasWings;
        private int weight;
        private String commonName;
        private boolean isMoving;

        public Insect() {
            this.numLegs = 4;
            this.hasWings = false;
            this.weight = 10;
            this.commonName = "bug";
            this.isMoving = false;
        }

        public Insect(int numLegs, boolean hasWings, int weight, String commonName, boolean isMoving) {
            this.numLegs = numLegs;
            this.hasWings = hasWings;
            this.weight = weight;
            this.commonName = commonName;
            this.isMoving = isMoving;
        }

        public int getNumLegs() {
            return numLegs;
        }

        public void setNumLegs(int numLegs) {
            this.numLegs = numLegs;
        }

        public boolean isHasWings() {
            return hasWings;
        }

        public void setHasWings(boolean hasWings) {
            this.hasWings = hasWings;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getCommonName() {
            return commonName;
        }

        public void setCommonName(String commonName) {
            this.commonName = commonName;
        }

        public boolean getMoving() {
            return isMoving;
        }

        public void setMoving(boolean isMoving) {
            this.isMoving = isMoving;
            if(isMoving == true) {
                System.out.println(commonName + " is moving.");
            }
            else {
                System.out.println(commonName + " is not moving.");
            }
        }
    }

    public static int charSearch(String string, char target) {
        int length = string.length();
        int i = 0;
        do {
            if(string.charAt(i) == target) return i;
            i++;
        } while (i < length);

        return -1;
    }

    public static int findMin(int a, int b) {
        if (a > b) return b;
        return a;
    }

    public static void countToZero(int timer) {
        if (timer < 0) {
            System.out.println("sorry");
        } else {
            do {
                System.out.println(timer);
                timer--;
            } while (timer >= 0);
        }
    }

    public static int getProductOfAll(int[] arr) {
        int product = arr[0];
        for (int i = 1; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void happyNewYear(int timer) {
        for (int i = timer; i > 0; --i) {
            if (i % 2 == 1) {
                System.out.println("OUU! " + i);
            } else {
                System.out.println("AAA! " + i);
            }
        }
        System.out.println("Happy New Year!");
    }

    public static void reverseString(String string) {
        String newString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            newString += string.charAt(i);
        }
        System.out.println(newString);
    }

    public static boolean isPalindrome(String string) {
        String newString1 = "";
        String newString2 = "";
        int j = string.length() - 1;
        for (int i = 0; i < j; i++) {
            newString1 += string.charAt(i);
            newString2 += string.charAt(j);
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
