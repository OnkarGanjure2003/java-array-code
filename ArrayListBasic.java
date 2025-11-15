package Lecture6;
import java.util.ArrayList;
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);   //in ArrayList name print all element but not in array
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        arr.add(0,1);
        System.out.println(arr);
        System.out.println(arr.get(2));
        arr.set(3,5);
        System.out.println(arr);
    }
}
