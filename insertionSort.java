package dsaJava;
import java.util.*;
public class insertionSort {
    public static void insertionSortCode(int[] arr, int size) {
        //Your code goes here
        for(int i=0;i<size-1;i++){
            int j=i;
            while(j>=0 && arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
            }
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<=size-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        insertionSortCode(arr, n);
    }
}

    

