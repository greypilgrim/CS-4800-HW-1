package Q1;

public class HourlyEmployee extends Employee{
    public int wage;
    public int numHoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socSecNumber,
                             int wage, int numHoursWorked){
        super(firstName, lastName, socSecNumber);
        this.setWage(wage);
        this.setNumHoursWorked(numHoursWorked);
    }

    public void setWage(int wage){
        this.wage = wage;
    }

    public int getWage(){
        return this.wage;
    }

    public void setNumHoursWorked(int numHoursWorked){
        this.numHoursWorked = numHoursWorked;
    }

    public int getNumHoursWorked(){
        return this.numHoursWorked;
    }
}
