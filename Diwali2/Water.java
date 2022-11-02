import java.util.Scanner;
class Water{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size=scan.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		int sum=0;
		int max=arr[0];
		for(int i=0;i<size;i++){
			if(max>arr[i]){
				sum+=arr[0]-arr[i];
			}
		}
		System.out.println(sum);
	}
}