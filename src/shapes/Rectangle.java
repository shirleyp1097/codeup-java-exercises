package shapes;

//public class Rectangle {
////    private double length;
////    private double width;
////
////    public Rectangle(double length, double width) {
////        this.length = length;
////        this.width = width;
////    }
////
////
////    public double getArea() {
////        double area = length * width;
////        return area;
////    }
////
////    public double getPerimeter() {
////        double perimeter = 2 * length + 2 * width;
////        return perimeter;
////    }
//}

class Rectangle extends Quadrilateral implements Measurable {

    Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
