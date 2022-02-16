package firnas;
import java.util.Scanner;
public class MultiplyTwoNumbers {
public static void main(String[] args) {
	int i;
	int j;
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the value for i: ");
	i=a.nextInt();
	System.out.println("Enter the valur for j: ");
	j=a.nextInt();
	 int mul=i*j;
	 System.out.println("The mulplication of i and j: "+mul);
}
}
