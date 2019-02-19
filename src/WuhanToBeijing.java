import main.java.company.model.*;

public class WuhanToBeijing {
    public static void main(String[] args) {
        Vehicle selfDriving = new SelfDriving("自驾");
        Vehicle bus = new Bus("大巴车");
        Vehicle subway = new Subway("火车");
        Vehicle airplane = new Airplane("飞机");
        System.out.println("可以选择的交通工具是：");
        chooseVehicle(selfDriving);
        chooseVehicle(bus);
        chooseVehicle(subway);
        chooseVehicle(airplane);
    }

    public static void chooseVehicle(Vehicle vehicle) {
        if (vehicle.getPrice() <= 500) {
            System.out.println(vehicle.getName());
        }
    }
}
