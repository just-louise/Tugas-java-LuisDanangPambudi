package week4.no2;
public class Rectangle extends Shape {
        private double length;
        private double width;

    public Rectangle(double length, double width){
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

        @Override
        public double area() {
        return length * width;
        }
        @Override
        public String toString() {
        return "shape name is=" + super.toString();
        }
}
