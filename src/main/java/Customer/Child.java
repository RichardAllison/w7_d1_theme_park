package Customer;

public class Child extends Customer {

    Adult supervisor;
    int age;

    public Child(String name, int age, double height, double wallet, Adult supervisor) {
        super(name, height, wallet);
        this.supervisor = supervisor;
        if (age < 2 || age > 16) {
            throw new IllegalArgumentException();
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

}
