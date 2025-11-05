package Lecture6;
import java.util.Scanner;
public class TwoElementSumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //code to print two elements whose sum is given target.
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==2){
//                    System.out.print("The Elements whose Sum 2 are: "+arr[i]+" "+arr[j]);
//                    break;
//                }
//            }
//        }

        //code to print boolean value that indicate sum of two element is tagrget number or not.
        boolean result=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==5){
                    result=true;
                }
            }
        }
        System.out.println("Two elements present in array whose sum is 5: "+result);

    }
}
