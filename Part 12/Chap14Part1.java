public class Chap14Part1 {
        
    public static void main(String[] args) {
        //poloymorphism
        Shape s1 = new Shape(2,3);
        Circle c1 = new Circle(10,20,5);
        Rectangle r1 = new Rectangle(50,100,100,20);
        s1.draw();
        System.out.println();
        c1.draw();
        r1.draw();
    }
}
