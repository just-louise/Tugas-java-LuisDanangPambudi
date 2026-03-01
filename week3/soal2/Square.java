package week3.soal2;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public String toString(){
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
