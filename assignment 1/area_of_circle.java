package Javafile;

import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        try {
            double radius = scanner.nextDouble();
            double area = Math.PI * Math.pow(radius, 2);
            System.out.printf("The area of the circle is: %.2f square units%n", area);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number for the radius.");
        } finally {
            scanner.close();
        }
    }
}

