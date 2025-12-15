package App;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter project initialized!");

        System.out.print("Enter miles: ");
        Scanner scanner = new Scanner(System.in);
        double miles = scanner.nextDouble();
        double kilometers = convertMilesToKilometers(miles);
        System.out.println(miles + " miles = " + kilometers + " kilometers");
    }

    public static double convertMilesToKilometers(double miles) {
        double i = 1.60934;
        return miles * i;
    }
}
