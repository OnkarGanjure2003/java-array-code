package Lecture112DArray;
public class MaxElementInTwoDArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,14,7,8},
                {9,10,11,12}
        };
        int maxEle=0;
        for(int i=0;i<arr.length;i++){   //row
            for(int j=0;j<arr[0].length;j++){ //column
                if(maxEle<arr[i][j]) {
                    maxEle = arr[i][j];
                }
            }
        }
        System.out.println(maxEle);
    }
}

