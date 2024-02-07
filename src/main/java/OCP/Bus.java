package OCP;

public class Bus extends Vehicle{
    public Bus(int maxspeed) {
        super(maxspeed, "Bus");
    }

    @Override
    public double calculateAlloeSpeed() {
        return super.maxspeed * 0.5;
    }
}
