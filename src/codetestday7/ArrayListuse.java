package codetestday7;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListuse {
    public static void main(String[] args) {
//        创建生成随机数对象，创建集合对象
        Random r = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
//        生成6个1-33之间的随机数
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list1.add(num);
        }
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
