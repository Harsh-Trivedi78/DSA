package Strings;

public class removeoutermostparenthesis {
    public String removeoutermostparenthesis(String s){
        int counter = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ')'){
                counter--;
            }
            if(counter != 0 ){
                ans.append(s.charAt(i));
            }
            if (s.charAt(i) == '(' ){
                counter++;

            }

        }
        return ans.toString();
    }
    public static void main(String[] args) {
        removeoutermostparenthesis obj = new removeoutermostparenthesis();
        String s = "(()())(())";
        System.out.println(obj.removeoutermostparenthesis(s)); // Output: ()()()
    }    
}

