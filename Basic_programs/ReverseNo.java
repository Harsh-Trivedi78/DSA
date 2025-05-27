// Description: This program reverses a given number using a while loop.



package Basic_programs;
import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number to reverse: ");
        long num = scanner.nextLong();
        long reversed = 0 ;
        while (num != 0 ) {
            long digit = num % 10 ;
            reversed = reversed * 10 + digit;
            num /= 10;
            
        }
        scanner.close();
        System.out.println("Reversed number: " + reversed);

    }
}
