package Lecture112DArray;
public class ForEachLoopForTwoDArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,14,7,8},
                {9,10,11,12}
        };
//        for(int i=0;i<arr.length;i++){
//            for(int ele:arr[i]){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }

        for(int[] a:arr){
            for(int ele: a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
