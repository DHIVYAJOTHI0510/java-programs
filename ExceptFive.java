public class ExceptFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip printing number 5
            }
            System.out.println(i);
        }
    }
}
