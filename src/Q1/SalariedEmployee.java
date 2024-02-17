package Q1;

public class SalariedEmployee extends Employee{
    public int weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socSecNumber, int weeklySalary){
        super(firstName, lastName, socSecNumber);
        this.setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(int weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary(){
        return this.weeklySalary;
    }
}
