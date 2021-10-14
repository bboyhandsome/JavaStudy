package codetestday6;

import java.util.Random;
import java.util.Scanner;

public class AcquireRandom {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sca = new Scanner(System.in);

        System.out.println("请输入随机数范围");
        int num = sca.nextInt();
        int num1 = r.nextInt(num) + 1;

        System.out.println(num1);


    }
}
