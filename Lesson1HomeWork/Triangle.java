package JavaOOP.Lesson1HomeWork;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("All side of triangle must contains positive value, but actually is:");
            System.out.println("Side A is: " + sideA);
            System.out.println("Side B is: " + sideB);
            System.out.println("Side C is: " + sideC);
        }
    }

    public Triangle() {

    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA > 0) {
            this.sideA = sideA;
        } else {
            throw new IllegalArgumentException("Side of triangle must contains positive value, but actually is: " + sideA);
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB > 0) {
            this.sideB = sideB;
        } else {
            throw new IllegalArgumentException("Side of triangle must contains positive value, but actually is: " + sideB);
        }
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC > 0) {
            this.sideC = sideC;
        } else {
            throw new IllegalArgumentException("Side of triangle must contains positive value, but actually is: " + sideC);
        }
    }

    public double getArea () {
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }

    @Override
    public String toString() {
        return "Your triangle with sides {" +
                "A = " + sideA +
                ", B = " + sideB +
                ", C = " + sideC +
                '}';
    }
}
