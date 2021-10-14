package codetestday11;

public class User {
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private String name ;
    private int money;


    public void show(){
        System.out.println("我叫:"+name+"余额"+money);
    }
}
