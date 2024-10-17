package ap_qap2_myrectanglemypointclass;

public class MyRectangle {
    // Instantiates two MyPoint objects for the top-left and bottom-right corners of
    // the rectangle
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors for MyRectangle class
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and setters for the top-left and bottom-right corners of a rectangle
    public MyPoint getTopLeft() {
        return this.topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return this.bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getTopLeftX() {
        return this.topLeft.getX();
    }

    public void setTopLeftX(int x) {
        this.topLeft.setX(x);
    }

    public int getTopLeftY() {
        return this.topLeft.getY();
    }

    public void setTopLeftY(int y) {
        this.topLeft.setY(y);
    }

    public int getBottomRightX() {
        return this.bottomRight.getX();
    }

    public void setBottomRightX(int x) {
        this.bottomRight.setX(x);
    }

    public int getBottomRightY() {
        return this.bottomRight.getY();
    }

    public void setBottomRightY(int y) {
        this.bottomRight.setY(y);
    }

    // Calculates the width and height of a rectangle
    public int getWidth() {
        return this.bottomRight.getX() - this.topLeft.getX();
    }

    public int getHeight() {
        return this.topLeft.getY() - this.bottomRight.getY();
    }

    // Calculates the area and perimeter of a rectangle
    public int getArea() {
        return this.getWidth() * this.getHeight();
    }

    public int getPerimeter() {
        return 2 * (this.getWidth() + this.getHeight());
    }

}
