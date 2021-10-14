package codetestday4;

public class PhoneReturn {
    public static void main(String[] args) {
        Phone one = new Phone();
        getphone(one);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println(one.brand);
    }

    public static Phone getphone(Phone param) {
        param.price = 6666.6;
        param.color = "蓝色";
        param.brand = "苹果";
        return param;
    }
}
