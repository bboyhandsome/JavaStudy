package codetestday1;

public class Demo03MethodReturn {
    public static void main(String[] args) {
        int square = getSum(10,20) * getSum(10,20);
        System.out.println(square);
    }
    public static int getSum(int a , int b){
        int result = a + b;
        return result;
    }
}
