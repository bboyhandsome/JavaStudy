package codetestday7;

import java.util.ArrayList;

public class ArrayPackge {
    public static void main(String[] args) {
        ArrayList<Integer> arrayA = new ArrayList<>();
        arrayA.add(20);
        arrayA.add(20);
        arrayA.add(20);
        System.out.println(arrayA);
        int a = arrayA.get(2);
        System.out.println(a);

    }
}
