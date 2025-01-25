package Strings;

import java.util.*;
    
public class Strings {
    public static void main(String[] args) {
        //Concatenation
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        // System.out.println(str3.length());
        //CharAt
        for(int i = 0 ; i<str3.length(); i++){
            // System.out.println(str3.charAt(i));
        }
        //String Comparison.
        String name1 ="harsh";
        String name2 = "harsh";
        if (name1.compareTo(name2) == 0){
            // System.out.println("Same");
        }
        else{
            // System.out.println("Not Same");
          }
     


        // "==" does not work everytime so we use compareto
          if(new String("Harsh") == new String("Harsh")){
            // System.out.println("Same");
          }else{
            // System.out.println("not same");
          }

          //substring
          String sentence = "my name is Khan";
          String name = sentence.substring(11);
          System.out.println(name);
          //Strings Are Immutable
          

    }

}
