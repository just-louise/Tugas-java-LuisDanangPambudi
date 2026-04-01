package week6;

public class Employee {
    private String nama;
    private int gaji;

    Employee(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    public void setnama(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return nama;
    }
    public int getgaji(){
        return gaji;
    }
    @Override
    public String toString(){
    return "Name=" + getnama() + " Salary=" + getgaji();
    }
}
