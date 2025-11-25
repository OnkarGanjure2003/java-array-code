package Lecture112DArray;
public class MinElementFromEachRowMaxElement {
    public static void main(String[] args) {
        int[][] arr={
                {1,62,3,4},
                {15,14,17,18},
                {9,10,11,12}
        };
        int minEle=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){   //row
            int rowMaxEle=0;
            for(int j=0;j<arr[0].length;j++){ //column
                if(rowMaxEle<arr[i][j]){
                    rowMaxEle=arr[i][j];
                }
            }
            if(minEle>rowMaxEle){
                minEle=rowMaxEle;
            }
        }
        System.out.println(minEle);
    }
}
