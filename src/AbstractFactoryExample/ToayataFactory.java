package AbstractFactoryExample;

public class ToayataFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Toyata();
    }
}
