package Lecture6;
import java.util.Scanner;
public class SecondMaxElementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("First Max Element: "+max);
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secmax && arr[i]!=max){
                secmax=arr[i];
            }
        }
        System.out.println("Second Max element: "+secmax);
    }

}
