package dsaJava;

import java.util.Scanner;
public class selectionSort {
    public static void selectionSortCode(int[] arr) {
       int n=arr.length;
        //Your code goes here
        for(int i=0;i<=n-1;i++){
            int min=i;
            for(int j=i+1;j<=n-1;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
         int temp=arr[i];
         arr[i]=arr[min];
         arr[min]=temp;
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args){
        System.out.println("N:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
    }
    selectionSortCode(arr);
    }

}