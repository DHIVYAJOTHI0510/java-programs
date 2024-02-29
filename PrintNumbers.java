public class PrintNumbers {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i++;
            System.out.println(i);
            if (i == 4) {
                break; // Exit the loop when i reaches 4
            }
        }
    }
}
