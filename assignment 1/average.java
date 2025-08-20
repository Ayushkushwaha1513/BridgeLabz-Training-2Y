package Javafile;

import java.util.Scanner;

public class average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        // Calculating average
        double average = (num1 + num2 + num3) / 3;

        // Displaying result
        System.out.println("Average = " + average);

        sc.close();
    }
}
