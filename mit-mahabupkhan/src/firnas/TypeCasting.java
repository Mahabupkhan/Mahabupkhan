package firnas;

public class TypeCasting {
public static void main(String[] args) {
	byte b=10;
	int i=b;
	int j=45;
	//b=i; //byte cannot accept integer
	byte d=(byte)j;
	System.out.println(d);
	
}
}
