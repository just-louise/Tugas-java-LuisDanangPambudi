package week3.soal2;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI * getRadius() * getRadius();
    }
    public double getPerimeter(){
        return 2 * Math.PI * getRadius();
    }
    @Override
    public String toString(){
        return "A circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }
}
