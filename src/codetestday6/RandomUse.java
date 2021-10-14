package codetestday6;

import java.util.Random;

public class RandomUse {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(300);
            System.out.println(num);
        }
    }
}
