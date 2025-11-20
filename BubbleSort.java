//package Lecture8;
//public class BubbleSort {
//    public static void bubbleSort(int[] arr){
//        int n=arr.length;
//        for(int i=0;i<n-1;i++){
//            System.out.println("pass "+(i+1));
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//                for(int ele:arr){
//                    System.out.print(ele+" ");
//                }
//                System.out.println();
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr={2,0,4,5,3};
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//        bubbleSort(arr);
//        System.out.println("After Bubble Sorting:");
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//    }
//}

//more optimized:stop forward passes if array is fully sorted.
package Lecture8;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean isSorted=true;
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    isSorted=false;
                    break;
                }
            }
            if(isSorted==true){
                break;
            }
            System.out.println("pass "+(i+1));
//            int swap=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
//                    swap++;
                }
                for(int ele:arr){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
//            if(swap==0){
//                break;
//            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,0,4,5,3};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("After Bubble Sorting:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
