package JavaOOP.Lesson2HomeWork;

public class Circle extends Shape {
    private Point center = new Point();
    private Point point = new Point();

    public Circle(Point center, Point point) {
        this.center = center;
        this.point = point;
    }

    public Circle() {
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    private double getLength(Point center, Point point) {
        return Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2));
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getLength(this.center, this.point), 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * getLength(this.center, this.point);
    }

    @Override
    public String toString() {
        return "Circle with center: " + center +
                " and point: " + point +
                " and Area: " + this.getArea();
    }
}
