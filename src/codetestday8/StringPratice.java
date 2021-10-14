package codetestday8;


public class StringPratice {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        System.out.println(format(array1));
    }
    public static String format(int[] array){

        String str1 = "[";
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                str1 = str1.concat("word" + array[i] + "#");//或str1 +="world" + array[i] + "#"
            } else{
                str1 = str1.concat("word" + array[i]);
            }
        }
        str1 = str1.concat("]");
        return str1;
    }
}
