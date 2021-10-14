package codetestday7;

import java.util.ArrayList;

public class ArrayListStudent {
    public static void main(String[] args) {
//        自定义四个学生对象
        Student stu1 = new Student(18, "则超");
        Student stu2 = new Student(19, "程波");
        Student stu3 = new Student(20, "陈祥");
        Student stu4 = new Student(21, "昭坤");
//        添加学生到集合
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(stu1);
        listStudent.add(stu2);
        listStudent.add(stu3);
        listStudent.add(stu4);

        printArray(listStudent);
    }

    public static void printArray(ArrayList<Student> stu) {
        System.out.print("{");
        for (int i = 0; i < stu.size(); i++) {
            if (i < stu.size() - 1) {
                String name1 = stu.get(i).getName();
                System.out.print(name1 + "@");
            } else if (i == stu.size() - 1 ){
                System.out.print(stu.get(i).getName());
            }
        }
        System.out.println("}");
    }
}
