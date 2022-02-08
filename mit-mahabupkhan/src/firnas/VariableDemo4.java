package firnas;

public class VariableDemo4 {
	public static void main(String[] args) {
		
	
String s="Hello World";
String st=new String("Hello world");
String str=String.valueOf("hello world");
System.out.println(s);
System.out.println(st);
System.out.println(str);

		int i=10;
		Integer ii=new Integer(20);
		Integer iii=Integer.valueOf(30);
		System.out.println(i);
		System.out.println(ii);
		System.out.println(iii);
		
		char c='a';
		Character cc='b';
		Character ccc=new Character('c');
		Character cccc=Character.valueOf('d');
		System.out.println(c);
		System.out.println(cc);
		System.out.println(ccc);
		
		int result=Integer.compare(10,20);
		System.out.println(result);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		String n1="100";
		String n2="200";
		System.out.println(n1+n2);
		
		int num1=Integer.parseInt(n1);
		int num2=Integer.parseInt(n2);
	System.out.println(num1+num2);
	
	String s1="a";
	String s2="b";
	str="My name isbilla";
	System.out.println(s1.compareTo(s2));
	System.out.println(str.indexOf('M'));
	System.out.println(str.substring(4,10));
	str="hello";
	String str2=new String("hii");
	System.out.println(str==str2);
	System.out.println(str.equals(str2));
	
			
	}
	
}
