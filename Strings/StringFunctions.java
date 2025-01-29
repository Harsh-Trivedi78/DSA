package Strings;

public class StringFunctions {

    //substring function manually
    public static String substring (String str, int start, int end) {
        String substr = "";
        for(int i = start ; i < end ; i ++){
            substr += str.charAt(i);

        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        String name1 ="harsh";
        String name2 = "harsh";
        String name3 = new String("harsh");
        System.out.println(substring(str , 0 , 5));
        
        //substring function inbuilt
       
        String subStr1 = str.substring(0,5);

        System.out.println(subStr1); // Output: World






        // Using == (Reference Comparison)
        //The == operator checks if both string references point to the same memory location.


        if (name1 == name2){
            // System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
          }
          if (name1 == name3){
            System.out.println("Same");
        }
        else{
            // System.out.println("Not Same");
          }

//Using equals() (Content Comparison)
//The .equals() method checks if two strings have the same content (case-sensitive).

          if (name1.equals(name3)) {
            // System.out.println("Strings are Same");
          } else {
            System.out.println("Not Same");
            
          }
    }
}
