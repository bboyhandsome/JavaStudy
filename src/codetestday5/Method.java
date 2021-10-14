package codetestday5;

public class Method {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 100};
        System.out.println(getMax(array));

    }

    public static int getMax(int[] param) {
        int max = param[0];
        for (int i = 1; i < param.length; i++) {
            if (max < param[i]) {
                max = param[i];
            }
        }
        return max;
    }
}
