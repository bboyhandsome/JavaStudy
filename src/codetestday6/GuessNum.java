package codetestday6;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
//        先创建随机数、输入函数对象
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
//        随机生成一个0-100的数
        int num2 = r.nextInt(101);

        while (true) {
            System.out.println("请输入你猜测的数字");
            int guessNum = sc.nextInt();
            if (guessNum < num2) {
                System.out.println("你猜的太小了");
            } else if (guessNum > num2) {
                System.out.println("你猜的太大了");
            } else if (guessNum == num2) {
                System.out.println("恭喜你猜对了，游戏结束！");
                break;
            }
        }
    }
}