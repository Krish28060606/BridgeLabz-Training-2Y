 import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Calculate handshakes
        int handshakes = (n * (n - 1)) / 2;

        // Output
        System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes);

        sc.close();
    }
}

