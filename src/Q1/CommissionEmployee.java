package Q1;

public class CommissionEmployee extends Employee{
    public int commissionRate;
    public int grossSales;

    public CommissionEmployee(String firstName, String lastName, String socSecNumber,
                                 int commissionRate, int grossSales){
        super(firstName, lastName, socSecNumber);
        this.setCommissionRate(commissionRate);
        this.setGrossSales(grossSales);
    }
    public void setCommissionRate(int commissionRate){
        this.commissionRate = commissionRate;
    }
    public int getCommissionRate(){
        return this.commissionRate;
    }
    public void setGrossSales(int grossSales){
        this.grossSales = grossSales;
    }
    public int getGrossSales(){
        return this.grossSales;
    }
}
