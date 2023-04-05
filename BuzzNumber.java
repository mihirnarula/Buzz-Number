/*
A number is said to be Buzz Number if it ends with 7 or is divisible by 7. Example: 1007 is a Buzz Number.
*/
package buzznumber;
import java.util.*;
public class BuzzNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Buzz Number: ");
        int num = sc.nextInt();
        int n = num%10;
        
        if(num % 7 == 0 || n == 7)
            System.out.println("BUZZ NUMBER");
        
    }
    
}
