import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        // Handle zero case
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10; // remove last digit
                count++;              // increase digit count
            }
        }

        // Output result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
