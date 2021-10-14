package codetestday4;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] arrayA = {10, 20, 30, 40, 50};
//        要求打印格式为：[10,20,30,40,50]
        System.out.print("[");
        for (int i = 0; i < arrayA.length; i++) {
            if (i == arrayA.length - 1) {
                System.out.println(arrayA[i] + "]");
            }else{
                System.out.print(arrayA[i] + ",");
            }
        }
        System.out.println("============");
        System.out.println(Arrays.toString(arrayA));
    }
}
