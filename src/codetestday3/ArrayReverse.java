package codetestday3;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] shu = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int temp;
        for (int i = 0; i < shu.length / 2; i++) {
            temp = shu[i];
            shu[i] = shu[shu.length - 1 - i];
            shu[shu.length - 1 - i] = temp;

        }
        for (int i = 0; i < shu.length; i++) {
            System.out.println(shu[i]);
        }
        System.out.println("===========");
//        用for循环标准格式写
        for (int min = 0, max = shu.length - 1; min < max; min++, max--) {
            temp = shu[min];
            shu[min] = shu[max];
            shu[max] = temp;
        }
        for (int i = 0; i < shu.length; i++) {
            System.out.println(shu[i]);
        }
        System.out.println("===========");
    }
}
