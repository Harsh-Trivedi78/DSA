package Strings;

public class LargestOddStrings {
    public static  String largestoddStrings(String num){
        for (int i = num.length() - 1 ; i >= 0 ; i--){
            char c = num.charAt(i);
            if((c - '0') %2 != 0 ){
                return num.substring(0 , i + 1);

            }
        }
        return ""; // If no odd digit is found, return an empty string
    }
    public static void main(String[] args) {
        String num = "22";
        System.out.println(largestoddStrings(num)); // Output: "123456789"
    }
}
