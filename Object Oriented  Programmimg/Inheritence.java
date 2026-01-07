class Shape{
    public void area() {
        System.out.println("Displaying... Area!");
    }

    class Triangle extends Shape {
        public void area(int l, int h){
        System.out.println(0.5 * l * h);
        }
    }

    class Square extends Shape {
        public void area(int l, int h){
            System.out.println(l*h);
        }
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Shape s1 = new Shape();

        s1.area();

        Shape.Square s2 = s1.new Square();
         s2.area(4,5);

         Shape.Triangle t1 = s1.new Triangle();
         t1.area(2,3);
    }
}
