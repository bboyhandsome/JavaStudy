package codetestday8;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        System.out.println(sc.nextInt());

        System.out.println("请输入第二个数字");
        System.out.println(sc.nextInt());
    }
}
