import java.util.Scanner;
public class StringConvert{
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       String input=s.next();
       int arr[]=new int[input.length()];
       for(int i=0;i<input.length();i++){
            arr[i]=arr[i]*10+(input.charAt(i)-'0');
       }
       for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
}
}