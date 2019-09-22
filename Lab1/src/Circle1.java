public class Circle1 {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    public Circle1() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle1(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {

        String result = "This is a big circle";

        if (radius < 5.0) {
            result = "This is a small circle";
        } else if (radius >= 5.0 && radius < 10.0) {
            result = "This is a medium circle";
        }
        return result;
    }

}
