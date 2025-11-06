//code to search number is present in array or not
package Lecture6;
import java.util.Scanner;
public class SearchNoInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Number to search: ");
        int num=sc.nextInt();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==num){
//                System.out.println("Number is present in array");
//                break;
//            }
//        }

        //other way
        boolean result=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                result=true;
                break;
            }
        }
        if(result==true){    //we can only write result its default value is true
            System.out.println("Number is present in array");
        }
        else{
            System.out.println("Number is not present in array");
        }
    }
}
