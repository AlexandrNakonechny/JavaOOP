package JavaOOP.Lesson1HomeWork;

public class Phone {
    private long phoneNumber;

    public Phone(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone() {
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void registration() {
        Network.phonesRegistration(phoneNumber);
    }

    public void call(long phoneNumber) {
        if (!(Network.isPhoneNumberRegistered(this.getPhoneNumber()))) {
            System.out.println("This phone number is not registered yet, pleas register first!");
            return;
        }
        if (Network.isPhoneNumberRegistered(phoneNumber)) {
            System.out.println("Call to +" + phoneNumber + " is successful!");
        } else {
            System.out.println("Phone number +" + phoneNumber + " is not registered yet. Call is unsuccessful. Please, try again later!");
        }
    }

    @Override
    public String toString() {
        return "Phone number is: +" + phoneNumber;
    }
}
