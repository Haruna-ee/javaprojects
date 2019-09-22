public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);

        Rectangle r2 = new Rectangle(2f, 5f);
        System.out.println(r2);
        System.out.println("The area is: " + r2.getArea());
        System.out.println("The perimeter is " + r2.getPerimeter());

        Rectangle r3 = new Rectangle(2f, 5f);

        System.out.println(r2.equals(r3));
        System.out.println(r2.toString().equals(r3.toString()));
        System.out.println(r2.getArea() == r2.getArea());
        System.out.println("Hello".equals("Hello"));
    }

}
