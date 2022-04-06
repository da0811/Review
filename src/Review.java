
public class Review {

    public static void main(String []args) {

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

}
