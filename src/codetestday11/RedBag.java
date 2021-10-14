package codetestday11;

import java.util.ArrayList;

public class RedBag {
    public static void main(String[] args) {
        QunZhu zechao = new QunZhu("陈则超",200);

        Staff one = new Staff("成员A",0);
        Staff two = new Staff("成员B",0);
        Staff three = new Staff("成员C",0);

        zechao.show();
        one.show();
        two.show();
        three.show();

        ArrayList<Integer> redlist = zechao.send(50,3);

        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);


    }
}
