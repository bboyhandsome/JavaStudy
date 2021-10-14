package codetestday4;

import codetestday3.Student1;

public class Demo02Student {
    public static void main(String[] args) {
        Student1 stu = new Student1();
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=======");
        stu.name = "陈则超";
        stu.age =23;
        stu.eat();
        stu.study();
        stu.sleep();

    }

}
