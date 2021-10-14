package codetestday4;

public class PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.color="土豪金";
        one.price=8377;

        method(one);

    }
    public static void method(Phone param){
        System.out.println(param.color);
        System.out.println(param.brand);
        System.out.println(param.price);
    }
}
