package JavaOOP.Lesson2HomeWork;

public class Main {
    public static void main(String[] args) {
        Point centerCircle = new Point(3, 2);
        Point pointCircle = new Point(8, 11);

        Point pointTriA = new Point(0, 0);
        Point pointTriB = new Point(0, 4);
        Point pointTriC = new Point(3,0);

        Point pointQuaA = new Point(0, 0);
        Point pointQuaB = new Point(0, 5);
        Point pointQuaC = new Point(6, 5);
        Point pointQuaD = new Point(6, 0);

        Circle circle = new Circle(centerCircle, pointCircle);
        System.out.println("Area of circle is: " + circle.getArea());
        System.out.println("Perimeter of circle is: " + circle.getPerimeter());
        System.out.println();

        Triangle triangle = new Triangle(pointTriA, pointTriB, pointTriC);
        System.out.println("Area of triangle is: " + triangle.getArea());
        System.out.println("Perimeter of triangle is: " + triangle.getPerimeter());
        System.out.println();

        Quadrangle quadrangle = new Quadrangle(pointQuaA, pointQuaB, pointQuaC, pointQuaD);
        System.out.println("Perimeter of quadrangle is: " + quadrangle.getPerimeter());
        System.out.println("Area of quadrangle is: " + quadrangle.getArea());
        System.out.println();

        Table table = new Table();
        table.addShape(0, circle);
        table.addShape(2, triangle);
        table.addShape(3, quadrangle);
        System.out.println("Sum areas of all shapes is: " + table.getSumAreasOfAllShapes());
        System.out.println();
        System.out.println(table.showAllShapes());

        table.deleteShape(2);
        System.out.println(table.showAllShapes());
    }
}
