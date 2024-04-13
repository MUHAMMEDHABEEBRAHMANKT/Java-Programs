import java.util.Scanner;

public class DigitProductSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int sum = 0;
        while (number1 > 0 && number2 > 0) {
            int digit1 = number1 % 10;
            int digit2 = number2 % 10;
            sum += digit1 * digit2;
            number1 /= 10;
            number2 /= 10;
        }

        System.out.println("Sum of product of corresponding digits: " + sum);

        scanner.close();
    }
}
