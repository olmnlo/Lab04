package shapes;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculateCircumference() {
        return 2*(width+height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0){
            System.err.println("you cannot enter negative");
        }else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            System.err.println("you cannot enter negative");
        }else {
            this.width = width;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
