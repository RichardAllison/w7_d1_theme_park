package Customer;

public class Adult extends Customer {

    int age;

    public Adult(String name, int age, double height, double wallet) {
        super(name, height, wallet);
        if (age < 16) {
            throw new IllegalArgumentException();
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

}
