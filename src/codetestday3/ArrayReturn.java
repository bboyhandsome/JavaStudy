package codetestday3;

public class ArrayReturn {
    public static void main(String[] args) {
        int[] result = shu(5,6,7);
        System.out.println("和为"+ result[0]);
        System.out.println("平均数为"+result[1]);
        System.out.println(result);
    }
    public static int[] shu(int a, int b, int c){
        int sum = a+b+c;
        int avg = sum/3;
        int[] shu1 = { sum,avg};
        return shu1;
    }
}
