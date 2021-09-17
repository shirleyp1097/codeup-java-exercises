package shapes;

//public class Square extends Rectangle{
////    private double side;
////
////    public Square(double side) {
////        super(side, side);
////        this.side = side;
////    }
////
////    public double getArea() {
////        return side * side;
////    }
////
////    public double getPerimeter() {
////        return side * 4;
////    }
//}

class Square extends Quadrilateral {

    Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return width * 4;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {


    }
}