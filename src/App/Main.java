package App;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Converter project initialized!");
        System.out.println("Version: 1.0");
        System.out.println("   Description: Simple console app for unit conversion.");

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " °C = " + fahrenheit + " °F");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F = " + celsius + " °C");

        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        double kilometers = convertMilesToKilometers(miles);
        System.out.println(miles + " miles = " + kilometers + " kilometers");

        System.out.println("Enter kilometers: ");
        kilometers = scanner.nextDouble();
        miles = convertKilometersToMiles(kilometers);
        System.out.println(kilometers + " kilometers = " + miles + " miles");

    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertMilesToKilometers(double miles) {
        double i = 1.60934;
        return miles * i;
    }

    public static double convertKilometersToMiles(double kilometers) {
        double i = 0.621371;
        return kilometers * i;
    }
}