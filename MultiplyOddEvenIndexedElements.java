//code to multiply odd indexed elements by 2 and add 10 to even indexed elements
package Lecture6;
import java.util.Scanner;
public class MultiplyOddEvenIndexedElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]+=10;
            }
            else{
                arr[i]*=2;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
