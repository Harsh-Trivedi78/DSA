
//Count how many times lowercase vowels occurred in a String entered by the
 //user.


package Strings;

import java.util.*;

public class StringVowels {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    scanner.close();
    int count = 0 ; 
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
            
        }
        
    }
    System.out.println(" Count of vowels is " + count);

    }
}
