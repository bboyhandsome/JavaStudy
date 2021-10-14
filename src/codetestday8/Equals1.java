package codetestday8;

import java.util.Arrays;

public class Equals1 {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "Java";
        System.out.println(str1.equalsIgnoreCase("JAva"));
        int length = "fhfhashfuwhfah".length();
        System.out.println(length);
        String str3 = "Hello";
        String str4 = "World";
        String str5 = str3.concat(str4);
        System.out.println(str5);

        System.out.println(str5.charAt(4));
        System.out.println(str5.indexOf("ord"));
        System.out.println(str5.substring(5));
        System.out.println(str5.substring(4, 6));

        char[] char1 = str5.toCharArray();
        for (int i = 0; i < char1.length; i++) {
            System.out.print(char1[i]);
        }
        System.out.println();
        int[] zifu1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(char1));

        byte[] byte1 = str5.getBytes();
        System.out.println(Arrays.toString(byte1));


    }
}
