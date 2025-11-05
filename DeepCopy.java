package Lecture6;
import java.util.Arrays;
public class DeepCopy {
    public static void main(String[] args) {
        int[] arr={11,12,13,14,15};
        int[] newarr=Arrays.copyOf(arr,arr.length);
        System.out.println(arr[0]);
        System.out.println(newarr[0]);
        newarr[0]=110;
        System.out.println(arr[0]);
        System.out.println(newarr[0]);

    }
}
