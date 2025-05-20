package Basic_programs;
import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int original = num, sum = 0;
        int digits = String.valueOf(num).length(); // Count number of digits

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits); // Raise digit to the power of total digits
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}
