//code to rotate array by given number means elements as given number  are shifted.
package Lecture6;
import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter rotation elements no:");
       int r=sc.nextInt();
       int[] arr={1,2,3,4,5,6,7,8};
       reverse(0,r-1,arr);
       reverse(r,arr.length-1,arr);
       reverse(0,arr.length-1,arr);
       for(int ele:arr){
           System.out.print(ele+" ");
       }
    }
    public static void reverse(int i,int j,int[] arr){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

}
