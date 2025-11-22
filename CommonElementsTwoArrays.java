////Give common Elements in two arrays in sorted order.
//package Lecture8;
//import java.util.Arrays;
//import java.util.ArrayList;
//public class CommonElementsTwoArrays {
//    public static void commonElement(int[] num1,int[] num2,ArrayList<Integer>cEle){
//        int i=0,j=0;
//        while(i<num1.length &&  j<num2.length){
//            if(num1[i]==num2[j]){
//              cEle.add(num1[i]);
//              i++;
//              j++;
//            }
//            else if(num1[i]<num2[j]){
//                i++;
//            }
//            else{
//                j++;
//            }
//
//        }
//    }
//    public static void main(String[] args) {
//        int[] num1={3,4,3,2,1};
//        int[] num2={4,6,2,1,3};
//        ArrayList<Integer>cEle=new ArrayList<>();
//        Arrays.sort(num1);
//        Arrays.sort(num2);
//        commonElement(num1,num2,cEle);
//        for(int ele:cEle){
//            System.out.print(ele+" ");
//        }
//    }
//}

////OR
package Lecture8;
import java.util.Arrays;
import java.util.ArrayList;
public class CommonElementsTwoArrays {
    public static ArrayList<Integer> commonElement(int[] num1,int[] num2){
        int i=0,j=0;
        ArrayList<Integer>cEle=new ArrayList<>();
        while(i<num1.length &&  j<num2.length){
            if(num1[i]==num2[j]){
                cEle.add(num1[i]);
                i++;
                j++;
            }
            else if(num1[i]<num2[j]){
                i++;
            }
            else{
                j++;
            }

        }
        return cEle;
    }
    public static void main(String[] args) {
        int[] num1={3,4,3,2,1};
        int[] num2={4,6,2,1,3};
        Arrays.sort(num1);
        Arrays.sort(num2);
        System.out.println(commonElement(num1,num2));
    }
}