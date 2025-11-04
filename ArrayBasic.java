package Lecture6;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        System.out.println(arr[2]);
        arr[2]=7;
        System.out.println(arr[2]);
        int[] arr1=new int[4];
        arr1[0]=2;
        arr1[1]=3;
        arr1[2]=4;
        arr1[3]=5;
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
