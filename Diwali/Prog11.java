import java.util.*;
public class Prog11{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int z=0;
		while(z<n){
			arr[z]=scan.nextInt();
			z++;
		}
		for(int i=0;i<n;i++){
			for(int j=1;j<n;j++){
				if(arr[j-1]<arr[j]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int mul=arr[0]*arr[1]*arr[2];
		System.out.println("Output: "+mul);
	}
}