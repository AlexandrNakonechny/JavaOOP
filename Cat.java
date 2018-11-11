package JavaOOP.Lesson1HomeWork;

public class Cat {
    private String name;
    private String breed;
    private String eyesColor;
    private boolean isHappy;
    private boolean isWellFed;

    public Cat(String name, String breed, String eyesColor) {
        this.eyesColor = eyesColor;
        this.name = name;
        this.breed = breed;
    }

    public Cat() {

    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public boolean isWellFed() {
        return isWellFed;
    }

    public void meow() {
        System.out.println("Me-e-e-eow");
    }

    public void feed() {
        System.out.println("'Wow, it's yammy!' - said " + this.name);
        isWellFed = true;
    }

    public void playWithBall() {
        System.out.println(this.name + " is playing with ball...");
        if (isWellFed == true) {
            isHappy = true;
        }
    }


    public String PetCondition() {
        if (isHappy) {
            return "happy! :)";
        }
        if (isWellFed) {
            return "sad. :( Try to play with him";
        } else {
            return "sad. :( Maybe you should to feed him?";
        }
    }

    @Override
    public String toString() {

        return "Your Pet " + name +
                ", breed " + breed +
                ", with " + eyesColor + " eyes" +
                " is " + PetCondition();
    }
}
