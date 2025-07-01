// Find the Sum of the Numbers in a Given Range in Java
// Given two integer inputs number1 and number2, the objective is to find the sum of all Number that lay in the given interval by writing a code to Find the Sum of the Numbers in a Given Range in Java Language.
package Basic_programs;
class Sum {
    public static void main(String[] args) {
       int a = 5 ;
       int b = 10 ;
       int sum = 0 ;
       
       for (int i = a ; i <= b ; i++){
           sum = sum + i;
           System.out.println("The sum is " + sum );
       }
    }
}