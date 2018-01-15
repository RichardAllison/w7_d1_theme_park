package Customer;

public abstract class Customer {

    String name;
    int age;
    double height;
    double wallet;

    public Customer(String name, int age, double height, double wallet) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.wallet = wallet;
    }

}
