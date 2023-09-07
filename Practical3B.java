interface Shape{
    double area();
}
//create Circle and Square which implements Class Shape. 
class Circle implements Shape{
    double radius;
    Circle(double d){
        radius = d;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}
class Square implements Shape{
    double side;
    Square(double d){
        side = d;
    }
    public double area(){
        return side * side;
    }
}
//Create a generic class Bounded Shape that extends shape. 
class BoundedShape<T extends Shape>{
    T ob;
    BoundedShape(T ob1){
        ob = ob1;
    }
    void area(String shape){
        System.out.println("area of " + shape + " is = " + ob.area());
    }
}
public class Practical3B{
	public static void main(String[] args) {
	    Circle c = new Circle ( 2);
		BoundedShape<Circle> boundedCircle = new BoundedShape<Circle>(c);
		boundedCircle.area( "circle");
		
		Square s = new Square(2);
		BoundedShape<Square> boundedSquare = new BoundedShape<Square>(s);
		boundedSquare.area( "square");
	}
}
