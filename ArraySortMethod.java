package Lecture6;
import java.util.Arrays;
public class ArraySortMethod {
    public static void main(String[] args) {
        int[] arr={11,16,13,10,-5};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
