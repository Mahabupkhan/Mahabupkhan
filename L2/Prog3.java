import java.util.Scanner;
class Prog3{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array size : ");
	int size=scan.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<size;i++)
		arr[i]=scan.nextInt();
	
	for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	int[] arr2=new int[size];
	
	int j=0;
	for(int i=0;i<size;i=i+2){
		
		arr2[i]=arr[j++];
	}
	j=size-1;
	for(int i=1;i<size;i=i+2)
		arr2[i]=arr[j--];
	
	for(int i=0;i<size;i++)
		System.out.print(arr2[i]+" ");
}
}