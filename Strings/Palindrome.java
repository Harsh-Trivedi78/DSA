package Strings;

public class Palindrome {

    public static boolean isPalindrome(String str){
        int n = str.length();
        // str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); Input: "AmanaplanacanalPanama"
// Output after toLowerCase: "amanaplanacanalpanama"
// Result: "amanaplanacanalpanama"
        for(int i  = 0 ; i <str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";  
        System.out.println(isPalindrome(str));
    
    }
}
