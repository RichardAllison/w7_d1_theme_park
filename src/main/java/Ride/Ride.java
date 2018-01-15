package Ride;

public abstract class Ride {

    double price;
    int minAge;
    int minHeight;

    public Ride(double price, int minAge, int minHeight){
        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

}
