package JavaOOP.Lesson1HomeWork;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector3D getVectorSumOfVectors(Vector3D vector) {
        Vector3D newVector = new Vector3D();
        newVector.x = this.x + vector.x;
        newVector.y = this.y + vector.y;
        newVector.z = this.z + vector.z;
        return newVector;
    }

    public double getLengthOfVector (Vector3D vector) {
        return Math.sqrt(Math.pow(vector.x, 2) + Math.pow(vector.y, 2) + Math.pow(vector.z, 2));
    }

    public double getScalarSumOfVectors(Vector3D vector) {
        return getLengthOfVector(this) + getLengthOfVector(vector);
    }

    @Override
    public String toString() {
        return "Vector {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
