package codetestday1;

public class Sum100 {
    public static void main(String[] args) {
        System.out.println("和为" + sum100());
    }
    public static int sum100(){
            int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum +=i;
        }
        return sum;
    }
}
