package ap_qap2_myrectanglemypointclass;

public class TestMyRectangle {
    public static void main(String[] args) {
        // Instantiate two MyPoint objects for the top-left and bottom-right corners of
        // a rectangle
        MyPoint point1 = new MyPoint(0, 4);
        MyPoint point2 = new MyPoint(12, 0);

        // Instantiate a MyRectangle object with the two MyPoint objects
        MyRectangle rectangle1 = new MyRectangle(point1, point2);
        System.out.println();
        System.out.println(rectangle1);

        // Instantiate a MyRectangle object with the coordinates of the two points
        MyRectangle rectangle2 = new MyRectangle(2, 8, 6, 6);
        System.out.println(rectangle2);
        System.out.println();

        // Tests the getters and setters for the top-left and bottom-right corners of a
        // rectangle
        System.out.println("Rectangle one top-left corner before modification: " + rectangle1.getTopLeft());
        rectangle1.setTopLeft(new MyPoint(2, 4));
        System.out.println("Rectangle one top-left corner after modification: " + rectangle1.getTopLeft());

        System.out.println(
                "Rectangle one bottom-right corner X value before modification: " + rectangle1.getBottomRightX());
        rectangle1.setBottomRightX(10);
        System.out.println(
                "Rectangle one bottom-right corner X value after modification: " + rectangle1.getBottomRightX());
        System.out.println();

        // Calculates the width and height of the rectangles
        System.out.println("Rectangle one width: " + rectangle1.getWidth() + " units");
        System.out.println("Rectangle one height: " + rectangle1.getHeight() + " units");
        System.out.println();
        System.out.println("Rectangle two width: " + rectangle2.getWidth() + " units");
        System.out.println("Rectangle two height: " + rectangle2.getHeight() + " units");
        System.out.println();

        // Calculates the area and perimeter of the rectangles
        System.out.println("Rectangle one area: " + rectangle1.getArea() + " square units");
        System.out.println("Rectangle one perimeter: " + rectangle1.getPerimeter() + " units");
        System.out.println();
        System.out.println("Rectangle two area: " + rectangle2.getArea() + " square units");
        System.out.println("Rectangle two perimeter: " + rectangle2.getPerimeter() + " units");
        System.out.println();
    }
}
