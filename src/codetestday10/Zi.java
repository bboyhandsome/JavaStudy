package codetestday10;

public class Zi {
    public Zi(){
        this(20);
        System.out.println("构造方法执行了");
    }
    public Zi(int u){
        this(10,50);
        System.out.println("本类构造方法执行了");
    }
    public Zi(int u,int y){
        System.out.println("本类构造方法2执行了");
    }

}
