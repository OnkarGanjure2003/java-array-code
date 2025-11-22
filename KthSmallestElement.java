package Lecture8;
public class KthSmallestElement {
    public static void selectionSort(int[] arr,int k){
        int n=arr.length;
        for(int i=0;i<k;i++){
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
        int k=3;
        selectionSort(arr,k);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }

}

