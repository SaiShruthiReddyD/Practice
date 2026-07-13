//Second Smallestelement in an array
import java.util.*;
public class SecondSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min1;
        int min2;
        if(arr[0]<arr[1]){
            min1=arr[0];
            min2=arr[1];
        }
        else{
            min1=arr[1];
            min2=arr[0];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
        }System.out.println("Second smallest element is:"+min2);
    }
}
