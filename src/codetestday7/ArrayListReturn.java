package codetestday7;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(500);
            list2.add(num);
        }
        System.out.println(select(list2));;
        System.out.println(select(list2).size());
    }

    public static ArrayList select(ArrayList<Integer> list) {
        ArrayList<Integer> listSmall = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (list.get(i) % 2 == 0) {
                listSmall.add(list.get(i));
            }
        }
       return listSmall;
    }


}
