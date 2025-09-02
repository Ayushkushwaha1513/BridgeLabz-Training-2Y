package Javafile;

import java.util.Scanner;

public class celsius{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        
        // Safely read input and handle potential invalid entries
        try {
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
            System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
