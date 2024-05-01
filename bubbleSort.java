package dsaJava;
import java.util.Scanner;

public class bubbleSort{
    public static void bubbleSortCode(int[] arr, int n) {
        //Your code goes here
        for(int i=0;i<=n-1;i++){
           int  swap=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=1;
                }
            
                }
                 if (swap==0){
                    break;
            }
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSortCode(arr,n);
    }
}