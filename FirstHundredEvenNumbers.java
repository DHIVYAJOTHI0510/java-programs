public class FirstHundredEvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2; // Start with the first even number

        System.out.println("The first 100 even numbers are:");
        while (count < 100) {
            System.out.println(number);
            number += 2; // Increment by 2 to get the next even number
            count++;
        }
    }
}
