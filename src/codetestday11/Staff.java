package codetestday11;

import java.util.ArrayList;
import java.util.Random;

public class Staff extends User {
    public Staff(String name, int money) {
        super(name, money);
    }

    public Staff() {
    }

    public void receive(ArrayList<Integer> redlist) {
//        从多个红包当中抽取一个给自己
        int index = new Random().nextInt(redlist.size());
        System.out.println("恭喜你抽中了" + redlist.get(index) + "元");
//        从红包列表中删除红包
        int red = redlist.remove(index);
//        当前成员自己有多少钱
        int money = super.getMoney();
        //        重新设置下拿到红包的成员的余额
        super.setMoney(money + red);

    }
}
