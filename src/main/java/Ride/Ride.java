package Ride;

public abstract class Ride {

    double price;
    int minAge;
    double minHeight;

    public Ride(double price, int minAge, double minHeight){
        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
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
}
