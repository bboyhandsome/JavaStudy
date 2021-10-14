package codetestday5;

public class Student1 {
    private String name;
    private int age;

    public Student1(){
        System.out.println("无参构造方法执行啦");
    }

    public Student1(String name,int age){
        System.out.println("全参构造方法执行了");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
