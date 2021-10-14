package codetestday6;

public class StudentUse {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(23);
        stu1.setName("则超");
        System.out.println(stu1.getAge());
        System.out.println(stu1.getName());
        System.out.println("========");

        Student stu2 = new Student("程波", 22);
        System.out.println(stu2.getAge());
        System.out.println(stu2.getName());
        System.out.println("========");

    }
}
