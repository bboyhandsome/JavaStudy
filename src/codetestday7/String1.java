package codetestday7;

public class String1 {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);

        char[] zifu1 = {'a','b','c'};
        String str2 = new String(zifu1);
        System.out.println(str2);

        byte[] byte1 = {65,66,67};
        String str3 = new String(byte1);
        System.out.println(str3);

    }
}
