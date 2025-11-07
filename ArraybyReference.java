//code to show array is passed by reference to methodC
package Lecture6;

public class ArraybyReference {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
    public static void change(int[] x){
        x[2]=6;
    }
}
