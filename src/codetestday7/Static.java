package codetestday7;

public class Static {
    private static int count = 210227109;
    private String name;
    private int age;
    public static String room;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Static() {
        this.id = count++;
    }

    public Static(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
