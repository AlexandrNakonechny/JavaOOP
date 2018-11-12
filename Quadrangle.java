package JavaOOP.Lesson2HomeWork;

public class Quadrangle extends Shape {
    private Point pointA = new Point();
    private Point pointB = new Point();
    private Point pointC = new Point();
    private Point pointD = new Point();

    public Quadrangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public Quadrangle() {
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

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    private double getLength(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2));
    }

    @Override
    public double getArea() {
        Triangle triangleABC = new Triangle(getPointA(), getPointB(), getPointC());
        Triangle triangleACD = new Triangle(getPointA(), getPointC(), getPointD());
        return triangleABC.getArea() + triangleACD.getArea();
    }

    @Override
    public double getPerimeter() {
        return getLength(pointA, pointB) + getLength(pointB, pointC) + getLength(pointC, pointD) + getLength(pointD, pointA);
    }

    @Override
    public String toString() {
        return "Quadrangle with points: " +
                "{A: " + pointA +
                ", B: " + pointB +
                ", C: " + pointC +
                ", D: " + pointD + '}' +
                " and Area:" + this.getArea();
    }
}
