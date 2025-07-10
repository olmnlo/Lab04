package shapes;

public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5*base*height;
    }

    @Override
    public double calculateCircumference() {
        //for equality and not equality
        if (base == height) {
            return base*3;
        }else {
            // // C^2 = a^2 + b^2
            double longest_side = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
            return longest_side + base + height;
        }
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if(base < 0){
            System.err.println("you cannot enter negative");
        }else {
            this.base = base;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
