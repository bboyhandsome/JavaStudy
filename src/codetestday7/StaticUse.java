package codetestday7;

public class StaticUse {
    public static void main(String[] args) {
        Static stu1 = new Static("程波",22);
        Static stu2 = new Static("则超",23);
        stu1.room = "516宿舍";
        System.out.println(stu1.getName()+"年龄为"+stu1.getAge()+"房间为"+Static.room+"学号"+stu1.getId());
        System.out.println(stu2.getName()+"年龄为"+stu2.getAge()+"房间为"+Static.room+"学号"+stu2.getId());
    }
}
