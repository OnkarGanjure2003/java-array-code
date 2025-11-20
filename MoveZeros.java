package Lecture8;
public class MoveZeros {
    public static void moveZero(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,0,4,0,-2,1};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        moveZero(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
