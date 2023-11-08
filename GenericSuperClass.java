package test;
abstract class Shape{
    double d;
    abstract double area();
}

class Circle extends Shape{
    Circle(double d1){
        d = d1;
    }
    double area() {
        return Math.PI * d * d;
    }
}

class Square extends Shape{
    Square(double d1){
        d = d1;
    }
    double area() {
        return d * d;
    }
}

class BoundedShape<T extends Shape>{
    T ob;
    BoundedShape(T ob1){
        ob = ob1;
    }
    void area(String shape) {
        System.out.println("Area of " + shape + " = " + ob.area());
    }
}

public class test {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        BoundedShape<Circle> boundedcircle = new BoundedShape<Circle>(c);
        boundedcircle.area("Circle");
        Square s = new Square(5);
        BoundedShape<Square> boundedsquare = new BoundedShape<Square>(s);
        boundedcircle.area("Square");
    }
}
