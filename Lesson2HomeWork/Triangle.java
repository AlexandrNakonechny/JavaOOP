package JavaOOP.Lesson2HomeWork;

public class Triangle extends Shape {
    private Point pointA = new Point();
    private Point pointB = new Point();
    private Point pointC = new Point();

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle() {
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    private double getLength(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2));
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - getLength(pointA, pointB)) * (p - getLength(pointB, pointC)) * (p - getLength(pointC, pointA)));
    }

    @Override
    public double getPerimeter() {
        return this.getLength(pointA, pointB) + this.getLength(pointB, pointC) + this.getLength(pointC, pointA);
    }

    @Override
    public String toString() {
        return  "Triangle with points: " +
                "{A: " + pointA +
                ", B: " + pointB +
                ", C: " + pointC + '}' +
                " and Area:" + this.getArea();
    }
}
