package codetestday1;

public class MethodDefine {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println(sum(10,20));
//        赋值调用
        int he = sum(2,3);
        System.out.println(he);

    }
    public  static int sum(int a, int b){
        int result = a + b;
        System.out.println("方法执行了");
        return  result;
    }
}
