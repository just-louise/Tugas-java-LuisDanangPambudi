package week6.no2;

public class Student {
    private String name;
    private int id;

    Student(int id, String name){
        this.name = name;
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "id=" + getId() + ", name=" + getName();
    }
}
