package Customer;

public class Child extends Customer {

    Adult supervisor;

    public Child(String name, int age, double height, double wallet, Adult supervisor) {
        super(name, age, height, wallet);
        this.supervisor = supervisor;
    }

    public int getAge() {
        return age;
    }

}
