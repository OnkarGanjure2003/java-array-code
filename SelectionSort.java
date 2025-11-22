package Lecture8;
public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int sEle=arr[i];
            int sIdx=i;
            for(int j=i;j<n;j++){
                if(arr[j]<sEle){
                    sEle=arr[j];
                    sIdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[sIdx];
            arr[sIdx]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={4,2,-2,5,6,7,0};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        selectionSort(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }

}
