package codetestday1;

public class MethodSame {
    public static void main(String[] args) {
        System.out.println(same(2,3));
        System.out.println(same1(3,3));

    }
    public static boolean same(int a,int b){
        boolean isame;
        if (a==b){
             isame = true;
        } else {
             isame = false;
        }
        return isame;
    }
    public static boolean same1(int a,int b) {
        boolean isame1 = a == b? true:false;
        return  isame1;
    }
}
