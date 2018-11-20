package calc;
import java.util.*;
public class Calc {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x;
    int y;
        System.out.println("enter a value of x");
		x = input.nextInt();
		
		System.out.println("enter a value of y;");
		y = input.nextInt();
		System.out.println("Enter a aritmetic value");
		char arm = input.next().charAt(0);
		if(arm =='+') {
			System.out.println("you choose addition");
			int sum = x + y;
			System.out.println("su m =" +sum);
		} 
                else  if(arm =='-') {
			System.out.println("you choose subtraction");
			int sum = x - y;
			System.out.println("sum =" +sum);
		}
                else if(arm =='*') {
			System.out.println("you choose multiplication");
			int sum = x * y;
			System.out.println("sum =" +sum);
		}
                else if (arm =='/') {
			System.out.println("you choose addition");
			int sum = x / y;
			System.out.println("sum =" +sum);
		}
    }
    
}
