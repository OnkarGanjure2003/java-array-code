package Lecture6;
import java.util.Vector;
import java.util.Collections;
public class AddingOne {
   public static Vector<Integer> addOne(int[] arr){
        Vector<Integer> ans=new Vector<>();
        int n=arr.length;
        int carry=1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry=0;
            }
            else{//arr[i]+carry==10
                ans.add(0);
                carry=1;
            }

        }
        if(carry==1){
            ans.add(1);
        }
        Collections.reverse(ans);
        return ans;

    }

    public static void main(String[] args) {
        int[] arr={9,9,9};
        System.out.println(addOne(arr));
    }
}

//Leetcode
//public class Solution {
//    public static int[] plusOne(int[] digits) {
//        int n = digits.length;
//
//        // Start from last digit
//        for (int i = n - 1; i >= 0; i--) {
//            if (digits[i] < 9) {
//                digits[i]++;       // Add 1 when no carry
//                return digits;
//            }
//
//            // If digit is 9, convert to 0 and continue to carry
//            digits[i] = 0;
//        }
//
//        // If all digits were 9 (e.g., 999 → 1000)
//        int[] newNumber = new int[n + 1];
//        newNumber[0] = 1;
//        return newNumber;
//    }
//
//    public static void main(String[] args) {
//        int[] digits = {1, 2, 3};
//        int[] result = plusOne(digits);
//
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
//    }
//}