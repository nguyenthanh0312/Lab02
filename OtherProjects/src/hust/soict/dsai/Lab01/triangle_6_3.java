import java.util.Scanner;

public class triangle_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the height of the triangle from the user
        System.out.print("Enter the height of the triangle (n): ");
        int n = scanner.nextInt();

        // Generate and print the centered triangle
        for (int i = 1; i <= n; i++) {
            // Print spaces for centering the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars (2*i - 1 stars in each row)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
