package Strings;

public class reverseWords {
    public String reverseWords(String s){
        int n = s.length();
        String ans = "";
        s = new StringBuilder(s).reverse().toString();  // Reverse the entire string first
        for(int i = 0 ; i < n ; i++){
            String word = "";
            while (i < n && s.charAt(i) != ' ') {

                word += s.charAt(i);
                i++;

            }
            word = new StringBuilder(word).reverse().toString();
            if (word.length() != 0) {
                ans += word + " ";

            }
        }
        return ans.trim();


    }
    public static void main(String[] args) {
        reverseWords obj = new reverseWords();
        String s = " the sky is blue";
        System.out.println(obj.reverseWords(s)); // Output: "blue is sky the"
    }
}
