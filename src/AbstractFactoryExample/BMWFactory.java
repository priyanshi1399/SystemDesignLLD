package AbstractFactoryExample;

public class BMWFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new BMW();
    }
}
