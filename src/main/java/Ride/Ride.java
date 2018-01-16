package Ride;
import Customer.Customer;

public abstract class Ride {

    double price;
    int minAge;
    double minHeight;
    int till;

    public Ride(double price, int minAge, double minHeight){
        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.till = 0;
    }

    public double getPrice() {
        return price;
    }

    public int getMinAge() {
        return minAge;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public boolean checkOldEnough(Customer customer) {
        return (customer.getAge() >= this.minAge);
    }

    public boolean checkTallEnough(Customer customer) {
        return (customer.getHeight() >= this.minHeight);
    }

    public void receivePayment(Customer customer) {
        customer.makePayment(this.price);
        this.till += this.price;
    }
}
