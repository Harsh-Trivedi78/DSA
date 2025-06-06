package Basic_programs;

import java.util.Scanner;

// import java.util.Scanner;

public class NOisPalindrome {
    public static boolean isPalindrome(int num){
        if(num < 0 ) 
            return false;

            int orignal = num;
            int reversed = 0;
        

    while (num != 0){
        int digit = num% 10;
        reversed = reversed * 10 + digit;
        num /= 10;


    
    }

System.out.println(orignal + "hai " + reversed);
return orignal == reversed;

    }

    public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the number to check if it is palindrome: ");
            int num = scanner.nextInt();
            scanner.close();
            if(isPalindrome(num))
                System.out.println(num + " is a palindrome number");
            else
                System.out.println(num + " is not a palindrome number");
    }
    
}



// 2nd method
// public class PalindromeNumber {

//     public static boolean isPalindrome(int num) {
//         String str = Integer.toString(num);  // Convert number to string
//         int n = str.length();
        
//         for (int i = 0; i < n / 2; i++) {
//             if (str.charAt(i) != str.charAt(n - i - 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//          scanner.close();
//         System.out.println(isPalindrome(num));  // Output: true
//     }
// }
