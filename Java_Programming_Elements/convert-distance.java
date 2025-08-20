import java.util.Scanner;



public class DistanceConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        // Input distance in feet

        System.out.print("Enter distance in feet: ");

        double distanceFeet = sc.nextDouble();



        // Convert feet to yards

        double distanceYards = distanceFeet / 3;



        // Convert yards to miles

        double distanceMiles = distanceYards / 1760;



        // Output

        System.out.println("Distance in feet: " + distanceFeet 

                           + " = " + distanceYards + " yards and " + distanceMiles + " miles");



        sc.close();

    }

}





