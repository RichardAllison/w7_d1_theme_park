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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWallet() {
        return wallet;
    }

    public void makePayment(double price) {
        wallet -= price;
    }
}
