public class FirstHundredOddNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        System.out.println("The first 100 odd numbers are:");
        while (count < 100) {
            if (number % 2 != 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
