package codetestday11;

import java.util.ArrayList;

public class QunZhu extends User {
    public QunZhu() {
    }

    public QunZhu(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalmoney, int count) {
//        创建一个红包列表
        ArrayList<Integer> redlist = new ArrayList<>();
//        查看群主有多少钱
        int leftmoney = super.getMoney();
//        如果钱不够就不发红包，返回空集合
        if (totalmoney > leftmoney) {
            System.out.println("余额不足");
            return redlist;
        }
//        如果钱够就扣
        super.setMoney(leftmoney - totalmoney);
//        发红包拆成count份
        int avg = totalmoney/count;
        int mod = totalmoney%count;
//        把红包放到集合中，余数包在最后一个红包
        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }
        int last = avg + mod;
        redlist.add(last);

        return  redlist;
    }
}
