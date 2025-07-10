package shapes;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        setRadius(radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double calculateCircumference() {
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            System.err.println("you cannot enter negative");
        }else {
            this.radius = radius;
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
