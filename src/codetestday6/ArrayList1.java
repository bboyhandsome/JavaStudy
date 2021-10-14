package codetestday6;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("我");
        list1.add("是");
        list1.add("陈");
        list1.add("则超");

        System.out.println(list1);
        System.out.println(list1.get(2));
        list1.remove(2);
        System.out.println(list1.size());

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
