package Bridgelabz.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Line Comparison ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Value of x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Value of y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Value of y2: ");
        double y2 = sc.nextDouble();

        double a = x2-x1;
        double b = y2-y1;

        double length_of_line = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(length_of_line);

    }
}
