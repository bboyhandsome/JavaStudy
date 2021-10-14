package codetestday9;

public class MathUse {
    public static void main(String[] args) {
        double num = -10.8;
        int count = 0;
        while (num < 5.9) {
            if (Math.abs(Math.ceil(num)) > 6 || Math.abs(Math.ceil(num)) < 2.1) {
                count++;
            } 
            num++;
        }
        System.out.println(count);
    }
}
