import shapes.Circle;
import shapes.Rectangle;
import shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------Circle------------------------");
        Circle circle = new Circle(4);
//        Circle circle = new Circle(-4); //this will show you error msg only
        System.out.println(circle);
        System.out.println("circle getRadius(): "+circle.getRadius());
        circle.setRadius(10);
        System.out.println("circle setRadius(10): "+ circle.getRadius());
        System.out.printf("circle calculateArea(): %.2f\n",circle.calculateArea());
        System.out.printf("circle calculateCircumference(): %.2f\n", circle.calculateCircumference());

        System.out.println("----------------------Rectangle------------------------");
        Rectangle rectangle = new Rectangle(5, 7);
//        Rectangle rectangle = new Rectangle(-1, 3); //this will show you error msg only
        System.out.println(rectangle);
        System.out.println("rectangle getHeight(): "+rectangle.getHeight());
        System.out.println("rectangle getWidth(): "+rectangle.getWidth());
        rectangle.setHeight(10);
        rectangle.setWidth(3);
        System.out.println("rectangle setHeight(10): "+ rectangle.getHeight());
        System.out.println("rectangle setWidth(3): "+ rectangle.getWidth());
        System.out.printf("rectangle calculateArea(): %.2f\n",rectangle.calculateArea());
        System.out.printf("rectangle calculateCircumference(): %.2f\n", rectangle.calculateCircumference());

        System.out.println("--------------------Triangle--------------------");
        Triangle triangle = new Triangle(3,3);
//        Triangle triangle = new Triangle(-10,3); //this will show you error msg only
        System.out.println(triangle);
        System.out.println("triangle getHeight(): "+triangle.getHeight());
        System.out.println("triangle getBase(): "+triangle.getBase());
        System.out.printf("triangle calculateArea(): %.2f\n",triangle.calculateArea());
        System.out.printf("triangle calculateCircumference(): %.2f\n", triangle.calculateCircumference());
        triangle.setHeight(3);
        triangle.setBase(4);
        System.out.println(triangle);
        System.out.println("triangle setHeight(3): "+ triangle.getHeight());
        System.out.println("triangle setBase(4): "+ triangle.getBase());
        System.out.printf("triangle calculateArea(): %.2f\n",triangle.calculateArea());
        System.out.printf("triangle calculateCircumference(): %.2f\n", triangle.calculateCircumference());





    }

}