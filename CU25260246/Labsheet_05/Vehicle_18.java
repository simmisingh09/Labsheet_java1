// Q18. Vehicle -> Car -> ElectricCar + Electric

class Vehicle_18 {

    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car18 extends Vehicle_18 {

    void drive() {
        System.out.println("Car is driving.");
    }
}

interface Electric18 {

    void chargeBattery();
}

class ElectricCar18 extends Car18 implements Electric18 {

    @Override
    public void chargeBattery() {
        System.out.println("Electric car battery is charging.");
    }

    public static void main(String[] args) {

        ElectricCar18 car = new ElectricCar18();

        car.start();
        car.drive();
        car.chargeBattery();
    }
}
