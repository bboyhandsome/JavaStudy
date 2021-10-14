package codetestday8;

import java.util.Scanner;

public class CountTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String string1 = sc.next();
        byte[] byte1 = string1.getBytes();

        int da = 0;
        int xiao = 0;
        int num = 0;
        int other = 0;


        for (int i = 0; i < byte1.length; i++) {
            if (byte1[i] >= 48 && byte1[i] <= 57) {
                num++;
            } else if (byte1[i] >= 65 && byte1[i] <= 90) {
                da++;
            } else if (byte1[i] >= 97 && byte1[i] <= 122) {
                xiao++;
            }else{
                other++;
            }
        }
            System.out.println("数字有"+num+"个");
            System.out.println("大写字母有"+da+"个");
            System.out.println("小写字母有"+xiao+"个");
            System.out.println("其他有"+other+"个");
    }
}
