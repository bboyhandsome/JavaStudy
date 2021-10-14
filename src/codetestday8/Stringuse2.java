package codetestday8;
import java.util.Arrays;
public class Stringuse2 {
    public static void main(String[] args) {
        String str1 = "How do you do?";
        String str2 = str1.replace("o", "0");
        System.out.println(str2);

        String str3 = "会玩不,.睿智一个睿智";
        String str4 = str3.replace("睿智", "聪明");
        System.out.println(str4);

        String[] array1 = str3.split(",");
        System.out.println(array1.length);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        String[] array2 = str3.split("\\.");
        System.out.println(array2.length);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
