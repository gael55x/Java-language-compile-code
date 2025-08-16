import java.util.*; 

public class Abstraction {
    public static void main(String[] args){
        Animal a1 = new Dog(); 
        Animal a2 = new Cat(); 
        a1.speak(); 
        a2.speak(); 
        a1.feed(); 

        // other thing
        Shape s1 = new Circle(3); 
        Shape s2 = new Rectangle(5,6); 
        Shape s3 = Shape.unitSquare(); 

        List<Shape> shapes = Arrays.asList(s1, s2, s3); 
        System.out.println("Total area = " + totalArea(shapes)); 
        System.out.println("Circle is big? " + s1.isBig());         
        System.out.println("Unit square is big? " + s3.isBig()); 
    }

    static double totalArea(List<Shape> shapes){
        double sum = 0; 
        for (Shape s : shapes) sum += s.area(); 
        return sum; 
    }
}

abstract class Animal{ 
    public abstract void speak(); 

    public void feed(){
        System.out.println("Nimal nikaon... "); 
    }
}

// abstraction via abstract class
class Dog extends Animal{
    @Override public void speak() {
        System.out.println("Woof for me iben"); 
    }
}

class Cat extends Animal{
    @Override public void speak(){
        System.out.println("Meow for me godzpro"); 
    }
}


// abstraction via interface
interface Shape{
    double area(); 

    default boolean isBig(){
        return area() > 10; 
    }

    static Shape unitSquare(){
        return new Rectangle(1,1); 
    }
}

class Circle implements Shape{
    private final double r; 
    Circle(double r){
        this.r = r; 
    }
    @Override
    public double area() {
        return Math.PI * r * r; 
    }
}

class Rectangle implements Shape{
    private final double w, h; 
    Rectangle(double w, double h){
        this.w = w; 
        this.h = h; 
    }
    @Override
    public double area(){
        return w * h; 
    }
}