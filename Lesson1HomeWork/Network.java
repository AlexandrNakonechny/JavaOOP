package JavaOOP.Lesson1HomeWork;

public class Network {
    private static long [] registeredPhones = new long[50];
    private static int count = 0;

    public static void phonesRegistration(long phoneNumber) {
        registeredPhones[count] = phoneNumber;
        count++;
    }

    public static boolean isPhoneNumberRegistered(long phoneNumber) {
        for (int i = 0; i < registeredPhones.length; i++) {
            if (registeredPhones[i] == phoneNumber) {
                return true;
            }
        }
        return false;
    }
}
