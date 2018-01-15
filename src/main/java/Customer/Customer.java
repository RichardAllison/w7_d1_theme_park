package Customer;

public abstract class Customer {

    String name;
    double height;
    double wallet;

    public Customer(String name, double height, double wallet) {
        this.name = name;
        this.height = height;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWallet() {
        return wallet;
    }
}
