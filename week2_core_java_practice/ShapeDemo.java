package week2_core_java_practice;
//rule 1:In any simple class, if you declare any method that method needs to be "abstract" method
//rule 2:In any simple class,if you have declared an abstract(),that class need to be declared as an "abstract class"
//rule 3:you can declare a class as an abstract class and it may or may not have any abstract methods or concrete methods
//rule 4:if any subclass wants to extend this abstract class:
//4.1: they have to implement all the abstract methods and provide the implementations
//if subclass fail to do so,that subclass also need to declare itself as an "abstract class"
//rule 5:you cannot instantiate an abstract class or  you cannot create an object of abstract class
abstract class Shape{
    //abstract method
    public abstract void area();
    public void display(){
        //concrete method/normal method
        System.out.println("This is shape class display...");
    }
}
class Circle extends Shape{

    @Override
    public void area() {
        System.out.println("Circle class area()..");
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        //
        Circle circle = new Circle();
        circle.area();
    }
}
