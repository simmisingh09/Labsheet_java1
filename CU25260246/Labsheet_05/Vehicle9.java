// Q9. Vehicle -> Car -> ElectricCar
class Vehicle9 {
    void start() {
        System.out.println("Vehicle started.");
    }

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car9 extends Vehicle9 {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class ElectricCar9 extends Car9 {
    void chargeBattery() {
        System.out.println("Electric car battery is charging.");
    }

    public static void main(String[] args) {
        ElectricCar9 e = new ElectricCar9();

        e.start();
        e.drive();
        e.chargeBattery();
        e.stop();
    }
}
