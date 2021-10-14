package codetestday5;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(30);
        stu.setMale(true);
        stu.setName("则超");

        System.out.println(stu.getAge());
        System.out.println(stu.getName());
        System.out.println(stu.isMale());
    }
}
