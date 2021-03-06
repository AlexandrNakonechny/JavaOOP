package JavaOOP.Lesson1HomeWork;

public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat("Matroskin", "Dvorovyi", "Green");
        Cat catTwo = new Cat("Barsik", "Pers", "Brown");
        Cat catThree = new Cat("Vaska", "Siam", "Blue");

        Triangle triangle = new Triangle(10, 5, 6);

        Vector3D vectorA = new Vector3D(5, 6, 3);
        Vector3D vectorB = new Vector3D(9, 5, 0);

        Phone phoneOne = new Phone(380961111111L);
        Phone phoneTwo = new Phone(380962222222L);
        Phone phoneThr = new Phone(380963333333L);

        System.out.println("_________________________________________________________________________________________");
        System.out.println("Try to check correct work of class Cat");
        System.out.println("_________________________________________________________________________________________");
        catOne.meow();
        catOne.feed();
        System.out.println(catOne);
        System.out.println();

        catTwo.meow();
        catTwo.playWithBall();
        System.out.println(catTwo);
        System.out.println();

        catThree.meow();
        catThree.feed();
        catThree.playWithBall();
        System.out.println(catThree);

        System.out.println("_________________________________________________________________________________________");
        System.out.println("Try to check correct work of class Triangle");
        System.out.println("_________________________________________________________________________________________");
        System.out.println(triangle);
        System.out.println("Square of triangle is: " + triangle.getArea());
        triangle.setSideA(5);
        System.out.println("Square of triangle now is: " + triangle.getArea());

        System.out.println("_________________________________________________________________________________________");
        System.out.println("Try to check correct work of class Vector3D");
        System.out.println("_________________________________________________________________________________________");
        System.out.println(vectorA);
        System.out.println(vectorB);
        System.out.println("Its vector sum: " + vectorA.getVectorSumOfVectors(vectorB));
        System.out.println("Its scalar sum of vectors: " + vectorA.getScalarSumOfVectors(vectorB));

        System.out.println("_________________________________________________________________________________________");
        System.out.println("Try to check correct work of class Phone and Network");
        System.out.println("_________________________________________________________________________________________");
        phoneOne.registration();
        phoneThr.registration();
        phoneOne.call(phoneThr.getPhoneNumber());
        phoneThr.call(phoneTwo.getPhoneNumber());
        phoneTwo.call(phoneThr.getPhoneNumber());
    }
}
