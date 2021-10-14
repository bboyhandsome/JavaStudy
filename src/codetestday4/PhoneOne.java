package codetestday4;

public class PhoneOne {
    public static void main(String[] args) {
        Phone shouji = new Phone();
        System.out.println(shouji.brand);
        System.out.println(shouji.price);
        System.out.println(shouji.color);

        shouji.brand = "华为";
        shouji.price = 5555.0;
        shouji.color = "蓝色";
        System.out.println(shouji.brand);
        System.out.println(shouji.price);
        System.out.println(shouji.color);
        System.out.println("===================");

        shouji.call("程波");
        shouji.sendMessage();
        System.out.println("=======");
        Phone shouji1 = new Phone();
        System.out.println(shouji1.brand);
        System.out.println(shouji1.price);
        System.out.println(shouji1.color);

        shouji1.brand = "苹果";
        shouji1.price = 8000.0;
        shouji1.color = "银色";
        System.out.println(shouji.brand);
        System.out.println(shouji.price);
        System.out.println(shouji.color);
        shouji1.call("祥子");
        shouji1.sendMessage();
    }
}
