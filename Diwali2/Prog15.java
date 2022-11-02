import java.util.Scanner;
class Prog15{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size=scan.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<size;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println(max);
		int min=arr[0];
		for(int i=0;i<size;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println(min);
		for(int i=min;i<=max;i++){
			for(int j=0;j<size;j++){
				if(i==arr[j])
					break;
				
			}
		}
		
	}
}