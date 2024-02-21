public class Main {

    public static void main(String[] args) {

        Car car = new Car("2024 BlackPiano CorollaGR AWD");
        runRace(car);

        Car mitsubishi = new GasPoweredCar("2002 Red Lancer Evolution VII" , 7, 4);
        runRace(mitsubishi);

        Car rivian = new EletricCar("2024 top Truck ", 600, 90);
        runRace(rivian);

        Car mitsubishiHybrid = new HybridCar("2024 Black Lancer Evolution XI" , 16, 3, 10);
        runRace(mitsubishiHybrid);



    }

    public static void runRace(Car car){

        car.startEngine();
        car.drive();
    }
}