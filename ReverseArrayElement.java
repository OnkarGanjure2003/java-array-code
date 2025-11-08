//code to reverse the array elements
package Lecture6;
import java.util.Scanner;
public class ReverseArrayElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,5,6,7,8,3,1};
//        int i=0;
//        int j=arr.length-1;
        System.out.print("Enter Starting index:");
        int i=sc.nextInt();
        System.out.print("Enter Ending index:");
        int j=sc.nextInt();

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }



}
