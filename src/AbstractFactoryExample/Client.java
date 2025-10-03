package AbstractFactoryExample;

public class Client {
    public static void main(String[] args) {

        VehicleFactory hondaFactory=new HondaFactory();
        Vehicle honda=hondaFactory.createVehicle();
        honda.start();
        honda.stop();


        VehicleFactory BMWFactory=new BMWFactory();
        Vehicle BMW=BMWFactory.createVehicle();
        BMW.start();
        BMW.stop();


    }
}
