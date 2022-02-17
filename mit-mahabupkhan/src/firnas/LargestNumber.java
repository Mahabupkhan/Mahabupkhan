package firnas;

public class LargestNumber {
public static void main(String[] args) {
	double n1=9,n2=0,n3=3;
	if(n1>=n2&&n1>=n3)
		System.out.println(n1 +" is the greatest number");
	else if(n2>=n1&&n2>=n3)
		System.out.println(n2 +" is the greatest number");
	else
		System.out.println(n3 +" is the greatest number");
}
}
