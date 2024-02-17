package Q2;

public class CargoShip extends Ship{

    private int cargoCapacity;
    public CargoShip(String shipName, String yearBuilt, int cargoCapacity) {
        super(shipName, yearBuilt);
        this.setCargoCapacity(cargoCapacity);
    }
    protected void setCargoCapacity(int cargoCapacity){
        this.cargoCapacity = cargoCapacity;
    }
    protected int getCargoCapacity(){
        return this.cargoCapacity;
    }

    @Override
    public String toString(){
        return "Ship Name: " + this.getShipName() + "\nShip Cargo Capacity: " + this.getCargoCapacity();
    }
}
