import java.util.Scanner;

public class OddNumbersCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        int count = 0;
        System.out.println("Odd numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Count of odd numbers: " + count);
    }
}
