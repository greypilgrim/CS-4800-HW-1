package Q1;
import java.util.*;

public abstract class Employee {
    protected String firstName, lastName, socSecNumber;

    protected Employee(String firstName, String lastName, String socSecNumber){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSocSecNumber(socSecNumber);
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSocSecNumber(String socSecNumber){
        this.socSecNumber = socSecNumber;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getSocSecNumber(){
        return this.socSecNumber;
    }
}
