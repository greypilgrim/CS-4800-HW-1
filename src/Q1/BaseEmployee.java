package Q1;

public class BaseEmployee extends Employee{
    public int baseSalary;

    public BaseEmployee(String firstName, String lastName, String socSecNumber, int baseSalary) {
        super(firstName, lastName, socSecNumber);
        this.setBaseSalary(baseSalary);
    }
    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary(){
        return this.baseSalary;
    }
}
