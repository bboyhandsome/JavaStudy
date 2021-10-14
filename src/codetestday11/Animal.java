package codetestday11;

public abstract class Animal {
    public abstract void eat();
    public Animal(){
        System.out.println("父类抽象构造方法执行了");
    }
    public abstract void sleep();
}
