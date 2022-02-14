package day2;

public class TypecastingDemo {
public static void main(String[] args) {
	int n=10;
	long ll=n;
	System.out.println(n);
	System.out.println(ll);
	
	byte bb=20;
	n=bb;
	System.out.println(n);
	System.out.println(bb);
	
	float f=90;
	f=n;
	//n=f; //integer cannot accept float
	
	char c='a';
	n=c;
	System.out.println(n);
	
	String s="23";
	n=Integer.parseInt(s);
	System.out.println(n);
	
	byte b1=10;
	byte b2=2;
	int result=b1*b2;
	System.out.println(result);
	float result2=b1+b2;
	System.out.println(result2);
	
	n=258;
	System.out.println(n%256);
	 
	bb=(byte)n;
	System.out.println(bb);
	
	f=89.67f;
	n=(int)f;
	System.out.println(n);
	
	
	
	
	
	
	
}
}
