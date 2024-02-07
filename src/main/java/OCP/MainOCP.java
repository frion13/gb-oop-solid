package OCP;

public class MainOCP {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(300, "Train");
        printVehiclemaxspeed(vehicle);
        vehicle = new Car(200);
        printVehiclemaxspeed(vehicle);
        vehicle = new Bus(100);
        printVehiclemaxspeed(vehicle);


    }
    public static void printVehiclemaxspeed(Vehicle vehicle){
        System.out.println(vehicle.type + "max_speed ->" + vehicle.calculateAlloeSpeed());
    }
}
