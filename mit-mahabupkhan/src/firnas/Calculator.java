package firnas;
import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
			System.out.println("Please enter a number...:");
	int num1=scan.nextInt();
	System.out.println("please enter another number...:");
	int num2=scan.nextInt();
	int sum=num1+num2;
	System.out.println("Addition of two  umber is...:"+sum);
}
}
