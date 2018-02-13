import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        int carMPG = scanner.nextInt();
        if (carMPG <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
        return;
        }

        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        double carTank = scanner.nextDouble();
        if (carTank <= 0){
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
        return;
        }

        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        double carPercent = scanner.nextDouble();
        if (carPercent < 0){
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
        return;
        }
        else if (carPercent > 100){
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
        return;
        }
        double rawRange = carMPG * carTank * (carPercent * 0.01);
        int range =(int)rawRange;
        if (range <= 25){
            System.out.print("Attention! Your current estimated range is running low: " + range + " miles left!!!");
        }
        else {
            System.out.print("Keep driving! Your current estimated range is: " + range + " miles!");
        }

    }
}
