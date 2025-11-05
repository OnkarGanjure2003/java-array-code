package Lecture6;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] arr={11,12,13,14,15};
        int[] copyarr=arr;  //copyarr is shallow copy of arr
        System.out.println(arr[0]);
        copyarr[0]=110;
        System.out.println(arr[0]);
        System.out.println(copyarr[0]);
    }
}
