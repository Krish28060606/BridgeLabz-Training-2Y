import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input unit price and quantity
        System.out.print("Enter unit price of item (INR): ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quantity +
                           " and unit price is INR " + unitPrice);

        sc.close();
    }
}
