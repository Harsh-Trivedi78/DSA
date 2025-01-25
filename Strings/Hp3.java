// Input an email from the user. 
// You have to create a username from the
// email by deleting the part that comes after ‘@’.
//  Display that username to the user.
package Strings;
import java.util.*;
public class Hp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Email = sc.next();
        String UserName = "";
        for(int i = 0 ; i < Email.length(); i++){
            if(Email.charAt(i) == '@'){
                break;
            }
            else{
                UserName += Email.charAt(i);
            }
         }
            System.out.println(UserName);
            }
        }
