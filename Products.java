public class Products {
    public static void main(String[] args) {
        long product = 1; // Initialize the product to 1

        for (int i = 1; i <= 100; i++) {
            product *= i;
        }

        System.out.println("The product of the first 100 numbers is: " + product);
    }
}
