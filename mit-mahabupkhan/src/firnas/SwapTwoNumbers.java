package firnas;

public class SwapTwoNumbers {
public static void main(String[] args) {
	float first=2.50f;
	float second=4.50f;
	System.out.println("---BEFORE SWAP---");
	System.out.println("FIRST NUMBER = "+first);
	System.out.println("SECOND NUMBER = "+second);
	
	float temporary=first;
	first=second;
	second=temporary;
	
	System.out.println("---AFTER SWAP---");
	System.out.println("FIRST NUMBER = "+first);
	System.out.println("SECOND NUMBER = "+second);
	
}
}
