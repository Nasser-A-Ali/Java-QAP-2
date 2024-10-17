package ap_qap2_mylinemypointclass;

public class TestMyLine {
    public static void main(String[] args) {
        // Instantiate two MyPoint objects for the start and end points of the line
        MyPoint point1 = new MyPoint(3, 0);
        MyPoint point2 = new MyPoint(8, 0);

        // Instantiate a MyLine object with the two MyPoint objects
        MyLine line1 = new MyLine(point1, point2);
        System.out.println();
        System.out.println(line1);

        // Instantiate a MyLine object with the coordinates of the two points
        MyLine line2 = new MyLine(2, 0, 2, 4);
        System.out.println(line2);
        System.out.println();

        // Tests the getters and setters for the beginning and ending points of a line
        System.out.println("Line one beginning point before modification: " + line1.getBegin());
        line1.setBegin(new MyPoint(1, 0));
        System.out.println("Line one beginning point after modification: " + line1.getBegin());

        System.out.println("Line one ending point before modification: " + line1.getEnd());
        line1.setEnd(new MyPoint(9, 0));
        System.out.println("Line one ending point after modification: " + line1.getEnd());

        System.out.println();

        // Tests the getters and setters for the beginning Xs and Ys of a line
        System.out.println("Line two beginning X before modification: " + line2.getBeginX());
        line2.setBeginX(1);
        System.out.println("Line two beginning X after modification: " + line2.getBeginX());

        System.out.println("Line two beginning Y before modification: " + line2.getBeginY());
        line2.setBeginY(9);
        System.out.println("Line two beginning Y after modification: " + line2.getBeginY());

        System.out.println();

        // Tests the getters and setters for the ending Xs and Ys of a line
        System.out.println("Line two ending X before modification: " + line2.getEndX());
        line2.setEndX(9);
        System.out.println("Line two ending X after modification: " + line2.getEndX());

        System.out.println("Line two ending Y before modification: " + line2.getEndY());
        line2.setEndY(7);
        System.out.println("Line two ending Y after modification: " + line2.getEndY());

        System.out.println();

        // Tests the getters and setters for XY coordinates of a line
        System.out.println("Line one beginning XY before modification: (" + line1.getBegin().getXY()[0] + ", "
                + line1.getBegin().getXY()[1] + ")");
        line1.getBegin().setXY(5, 0);
        System.out.println("Line one beginning XY after modification: (" + line1.getBegin().getXY()[0] + ", "
                + line1.getBegin().getXY()[1] + ")");

        System.out.println("Line one ending XY before modification: (" + line1.getEnd().getXY()[0] + ", "
                + line1.getEnd().getXY()[1] + ")");
        line1.getEnd().setXY(15, 0);
        System.out.println("Line one ending XY after modification: (" + line1.getEnd().getXY()[0] + ", "
                + line1.getEnd().getXY()[1] + ")");

        System.out.println();

        // Tests the getLength() method of a line
        System.out.println("Line one length: " + line1.getLength());
        System.out.println("Line two length: " + line2.getLength());

        System.out.println();

        // Tests the getGradient() method of a line
        System.out.println("Line one gradient: " + line1.getGradient());
        System.out.println("Line two gradient: " + line2.getGradient());

        System.out.println();

        // Tests the toString() method of a line
        System.out.println("Line one: " + line1);
        System.out.println("Line two: " + line2);

        System.out.println();
    }
}
