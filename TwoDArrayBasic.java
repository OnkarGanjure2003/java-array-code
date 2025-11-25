package Lecture112DArray;
import java.util.Scanner;
public class TwoDArrayBasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int[][] arr=new int[3][4];
//        for(int i=0;i<arr.length;i++){   //row
//            for(int j=0;j<arr[0].length;j++){ //column
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<arr.length;i++){   //row
//            for(int j=0;j<arr[0].length;j++){ //column
//                System.out.println("Enter element in "+i+" row and "+j+" column:");
//               arr[i][j]=sc.nextInt();
//            }
//        }

//        int[][] arr={
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12}
//        };
//        for(int i=0;i<arr.length;i++){   //row
//            for(int j=0;j<arr[0].length;j++){ //column
//                System.out.print(arr[i][j]+"   ");
//            }
//            System.out.println();
//        }

        //code to print sum of 2D array elements
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int sum=0;
        for(int i=0;i<arr.length;i++){   //row
            for(int j=0;j<arr[0].length;j++){ //column
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
