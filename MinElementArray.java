package Lecture6;
import java.util.Scanner;
public class MinElementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]) {
                min=arr[i];
            }
        }
        System.out.print("Min Element in array: "+min);
    }
}
