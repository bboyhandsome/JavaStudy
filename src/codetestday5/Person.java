package codetestday5;

public class Person {
    public String name;
    private int age;

    public Person() {
    }

    public void resume() {
        System.out.println("我叫" + name + "," + "年龄" + age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int param){
        if (param<100 && param >5){
            age = param;
        }else{
            System.out.println("数据不合理");
        }
    }
    public int getAge(){
        return age;
    }
}
