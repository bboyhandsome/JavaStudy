package codetestday3;

public class staticInitail {
    public static void main(String[] args) {
        int[] array1 = new int[] {5, 15, 25};
//        省略格式
        int[] array2 = {5, 15, 25};
//        省略格式不能拆分成两个步骤
/*        int[] arrayC ;错误写法
        arrayC = {2,34,4,}*/
        System.out.println(array2[2]);
        int a = array2[1], b = array2[0];
        System.out.println(a+b);
//        动态数组默认值测试
        int[] arrayD = new int[3];
        System.out.println(arrayD[2]);
        arrayD[2] = 66;
        System.out.println(arrayD[2]);
    }
}
