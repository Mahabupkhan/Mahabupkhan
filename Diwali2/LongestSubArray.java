import java.util.*;
class LongestSubArray{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size=scan.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		
		
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]<arr[j]){
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		//for(int i=0;i<size;i++)
		//	System.out.print(arr[i]+" ");
		System.out.println("Enter the k value : ");
		int k=scan.nextInt();
		int count=0;
		int countbig=0;
		for(int i=0;i<size;i++){
			count=1;
			int diff=k-arr[i];
			for(int j=i+1;j<size;j++){
				diff=diff-arr[j];
				count++;
				if(diff<0){
					break;
				}
				if(diff==0){
					if(count>=countbig){
						countbig=count;
					}
				}
				if(diff>0){
					continue;
				}
				
			}
		}
		System.out.println("Longest sub array : "+countbig);
		   
		
		
		
	}
}