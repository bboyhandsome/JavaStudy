package codetestday5;

public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setName(String param){
        name = param;
    }
    public String getName(){
        return name;
    }
//
    public void setAge(int param){
        age = param;
    }
    public int getAge(){
        return age;
    }
//
    public void setMale(boolean param){
        male = param;
    }

    public boolean isMale(){
        return male;
    }

}
