package codetestday4;

public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("打电话给"+who);
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }
}
