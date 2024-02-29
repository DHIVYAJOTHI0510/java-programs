public class Divisibleby2,3 {
    public static void main(String[] args) {
        System.out.println("Numbers between 1 and 100 divisible by both 2 and 3:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
