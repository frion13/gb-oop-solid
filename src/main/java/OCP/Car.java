package OCP;

public class Car extends Vehicle{
    public Car(int maxspeed) {
        super(maxspeed,  "Car");
    }

    @Override
    public double calculateAlloeSpeed() {
        return super.maxspeed * 0.8;
    }
}
