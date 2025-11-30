import java.util.Scanner;

/**
 * Write a description of class TaxSys here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TaxSys
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your annual income (NPR): ");
        double income = scanner.nextDouble();

        double tax = 0;
        if (income <= 500000) {
            tax = income * 0.01;
        } else if (income <= 700000) {
            tax = 500000 * 0.01 + (income - 500000) * 0.10;
        } else {
            tax = 500000 * 0.01 + 200000 * 0.10 + (income - 700000) * 0.20;
        }
         System.out.printf("Total tax payable is NPR %.0f%n", tax);
    }
}
