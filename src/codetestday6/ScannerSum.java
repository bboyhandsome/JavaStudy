package codetestday6;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num3 = scann.nextInt();
        System.out.println("请输入第二个数字");
        int num4 = scann.nextInt();

        System.out.println(num3+num4);

    }
}
