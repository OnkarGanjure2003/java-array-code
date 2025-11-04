//code to print negative array elements
package Lecture6;
import java.util.Scanner;
public class NegativeElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Negative Elements Of Array: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
