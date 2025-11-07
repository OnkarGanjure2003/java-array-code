//code to print max element in array
package Lecture6;
import java.util.Scanner;
public class MaxElementArray {
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
            if(max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.print("Max Element in array: "+max);

        //other way
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(max<arr[i]) {
//                max=arr[i];
//            }
//        }
//        System.out.print("Max Element in array: "+max);
    }
}
