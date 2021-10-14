package codetestday8;
import codetestday5.Person;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);

        char[] array1 = {'a', 'b', 'c'};
        String str2 = new String(array1);
        System.out.println(str2);

        byte[] array2 = {97, 98, 99};
        String str3 = new String(array2);
        System.out.println(str3);

        String str4 = "abc";
        System.out.println(str4);

        if(str2 == str3){
            System.out.println("字符数组字符串与字节数组字符串地址相同");
        }else {
            System.out.println("字符数组字符串与字节数组字符串地址不同");
        }
        Person per = new Person("名义",20);
        Method(per);

        System.out.println("===========");

        System.out.println(str2.equals(str3));
        System.out.println(str2.equals("abc"));
        System.out.println("abc".equals(str3));
    }
    public static void Method(Person param){
        System.out.println(param.getAge());
    }
}
