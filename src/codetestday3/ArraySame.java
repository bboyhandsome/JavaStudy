package codetestday3;

public class ArraySame {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("==========");
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("==========");
        int[] arrayB = arrayA;
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("==========");
        arrayB[1] = 200;
        arrayB[2] = 2000;
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        int len = arrayB.length;
        System.out.println(len);
        System.out.println("=========");
        int[] arrayE = new int[3];
        System.out.println(arrayE);
        arrayE = new int[5];
        System.out.println(arrayE);
        System.out.println("==========");
        for (int i = 0; i < arrayE.length; i++) {
            System.out.println(arrayE[i]);
        }
        int max = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            if (max < arrayA[i]) {
                max = arrayA[i];
            }
        }
        System.out.println("最大值为" + max);

    }
}
