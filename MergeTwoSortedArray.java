package Lecture6;
public class MergeTwoSortedArray {
    public static void mergeArray(int[] num1,int[] num2,int[] num3) {
        int i = 0, j = 0, k = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) {
                num3[k] = num1[i];
                i++;
                k++;
            } else {
                num3[k] = num2[j];
                j++;
                k++;
            }
        }
        if (i == num1.length) {
            while (j < num2.length) {
                num3[k] = num2[j];
                k++;
                j++;
            }
        } else {
            while (i < num1.length) {
                num3[k] = num1[i];
                k++;
                i++;
            }

        }
    }
        public static void main (String[]args){
            int[] num1 = {1,3,4,5};
            int[] num2 = {2,5,6,7};
            int[] num3 = new int[num1.length + num2.length];
            mergeArray(num1, num2, num3);
            for(int ele:num3){
                System.out.print(ele+" ");
            }
        }
}
