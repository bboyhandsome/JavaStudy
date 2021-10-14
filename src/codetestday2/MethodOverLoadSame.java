package codetestday2;

public class MethodOverLoadSame {
    public static void main(String[] args) {
        System.out.println(same((short)10,(short)20));
    }
    public static boolean same(byte a,byte b){
        return a==b;
    }
    public static boolean same(short a,short b) {
        return a == b;
    }
    public static boolean same(int a,int b) {
        return a == b;
    }
    public static boolean same(long a,long b) {
        return a == b;
    }

}
