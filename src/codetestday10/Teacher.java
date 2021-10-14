package codetestday10;

public class Teacher extends  Employee{
    int age = 20;
    @Override
    public int method(){
        System.out.println(super.age);
        return age;
    }
}
