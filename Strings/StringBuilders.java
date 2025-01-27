package Strings;


public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Welcome");
          //Set Char
          System.out.println(sb.charAt(0));
        //   get char
          sb.setCharAt(0,'p');
          System.out.println(sb);
          sb.delete(0, 01);
          System.out.println(sb);
    
        // Append text
        sb.append(" to Java");
        System.out.println(sb); // Output: Welcome to Java
        System.out.println(sb.length());
        // Insert text
        sb.insert(8, "the world of ");
        System.out.println(sb); // Output: Welcome to the world of Java

        // Reverse text
        sb.reverse();
        System.out.println(sb); // Output: avaJ fo dlrow eht ot emocleW
    for(int i=0;i<sb.length()/2;i++){
        int front = i ;
        int back = sb.length()-i-1;


        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);


        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);
        }
       System.out.println(sb);
    
    
    }
}
