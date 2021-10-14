package codetestday5;

public class Student1test {
    public static void main(String[] args) {

        Student1 stu = new Student1();
        Student1 stu2 = new Student1("则超", 23);
        System.out.println(stu2.getAge());
        System.out.println(stu2.getName());
    }
}
