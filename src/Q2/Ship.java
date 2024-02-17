package Q2;
import java.util.*;
public class Ship {
    private String shipName, yearBuilt;

    public Ship(String shipName, String yearBuilt){
        this.setShipName(shipName);
        this.setYearBuilt(yearBuilt);
    }

    protected void setShipName(String shipName){
        this.shipName = shipName;
    }
    protected String getShipName(){
        return this.shipName;
    }

    protected void setYearBuilt(String yearBuilt){
        this.yearBuilt = yearBuilt;
    }
    protected String getYearBuilt(){
        return this.yearBuilt;
    }

    public String toString(){
        return "Ship Name: " + this.getShipName() + "\nYear Built: " + this.getYearBuilt();
    }
}
