
import java.util.Scanner;

public class CarpoolSavingsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user inputs
        System.out.print("Enter total miles driven per day: ");
        double milesDriven = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = scanner.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = scanner.nextDouble();

        // Calculating daily cost of driving
        double dailyFuelCost = (milesDriven / milesPerGallon) * costPerGallon;
        double totalDailyCost = dailyFuelCost + parkingFees + tolls;

        // Displaying result
        System.out.printf("Your daily driving cost is: ₹%.2f%n", totalDailyCost);
        
        scanner.close();
    }
}
