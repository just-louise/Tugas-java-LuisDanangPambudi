package week3.soal2;

public class TestShape {
    public static void main(String[] args) {
        //uji shape
        System.out.println("===uji shape===");
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("black", true);
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println("\n===uji setcolor dan setfilled===");
        shape1.setColor("blue ");
        shape1.setFilled(false);
        System.out.println(shape1.toString());
        shape2.setColor("pink");
        shape2.setFilled(false);
        System.out.println(shape2.toString());

        // Uji Circle
        System.out.println("\n=== Uji Circle ===");
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        Circle c2 = new Circle(5.0);
        System.out.println(c2);
        Circle c3 = new Circle(3.0, "red", true);
        System.out.println(c3);

        // Uji Rectangle
        System.out.println("\n=== Uji Rectangle ===");
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        Rectangle r2 = new Rectangle(4.0, 5.0);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(3.0, 6.0, "blue", true);
        System.out.println(r3);

        // Uji Square
        System.out.println("\n=== Uji Square ===");
        Square sq1 = new Square();
        System.out.println(sq1);
        Square sq2 = new Square(5.0);
        System.out.println(sq2);
        Square sq3 = new Square(3.0, "pink", true);
        System.out.println(sq3);
        System.out.println("\nSebelum setWidth:");
        System.out.println("Width: " + sq2.getWidth() + " Length: " + sq2.getLength());
        sq2.setWidth(10.0);
        System.out.println("\nSesudah setWidth(10.0):");
        System.out.println("Width: " + sq2.getWidth() + " Length: " + sq2.getLength());
    }
    
}
