package Q2;

public class CruiseShip extends Ship{

    private int maxNumPassengers;
    public CruiseShip(String shipName, String yearBuilt, int maxNumPassengers) {
        super(shipName, yearBuilt);
        this.setMaxNumPassengers(maxNumPassengers);
    }

    protected void setMaxNumPassengers(int maxNumPassengers){
        this.maxNumPassengers = maxNumPassengers;
    }
    protected int getMaxNumPassengers(){
        return this.maxNumPassengers;
    }

    @Override
    public String toString(){
        return "Ship Name: " + this.getShipName() + "\nMaximum Number of Passengers: " + this.getMaxNumPassengers();
    }
}
