import Q1.*;
import java.util.*;

public class EmployeeDriver {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee joe = new SalariedEmployee
                ("Joe", "Jones", "111-11-1111", 2500);
        Employee stephanie = new HourlyEmployee
                ("Stephanie", "Smith", "222-22-2222", 25, 32);
        Employee mary = new HourlyEmployee
                ("Mary", "Quinn", "333-33-3333", 19, 47);
        Employee nicole = new CommissionEmployee
                ("Nicole", "Dior", "444-44-4444", 15, 50000);
        Employee renwa = new SalariedEmployee
                ("Renwa", "Chanel", "555-55-5555", 1700);
        Employee mike = new BaseEmployee
                ("Mike", "Davenport", "666-66-6666", 95000);
        Employee mahnaz = new CommissionEmployee
                ("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        employees.add(joe);
        employees.add(stephanie);
        employees.add(mary);
        employees.add(nicole);
        employees.add(renwa);
        employees.add(mike);
        employees.add(mahnaz);

        printHeader();
        System.out.println();

        for(int i = 0; i < employees.size(); i++){
            printEmpInfo((Employee) employees.get(i));
            System.out.println();
        }
    }
    public static void printHeader(){
        System.out.printf("|%-9s |%-9s |%-12s |%-6s |%-4s |%-5s |%-4s |%-6s |%-5s",
                "First Name", "Last Name", "Social Sec #", "Weekly", "Wage", "Hours", "Comm", "Gross", "Base");
    }

    public static void printEmpInfo(Employee employee){
        if(employee instanceof SalariedEmployee){
            System.out.printf("|%-10s |%-9s |%-12s |$%-5s |%-4s |%-5s |%-4s |%-6s |%-5s",
                    employee.getFirstName(), employee.getLastName(), employee.getSocSecNumber(),
                    ((SalariedEmployee) employee).getWeeklySalary(), "", "", "", "", "");
        }

        if(employee instanceof HourlyEmployee){
            System.out.printf("|%-10s |%-9s |%-12s |%-6s |$%-3s |%-5s |%-4s |%-6s |%-5s",
                    employee.getFirstName(), employee.getLastName(), employee.getSocSecNumber(), "",
                    ((HourlyEmployee) employee).getWage(), ((HourlyEmployee) employee).getNumHoursWorked(), "", "", "");
        }

        if(employee instanceof CommissionEmployee){
            System.out.printf("|%-10s |%-9s |%-12s |%-6s |%-4s |%-5s |%%%-3s |$%-5s |%-5s",
                    employee.getFirstName(), employee.getLastName(), employee.getSocSecNumber(), "",
                    "", "", ((CommissionEmployee) employee).getCommissionRate(), ((CommissionEmployee) employee).getGrossSales(), "");
        }
        if (employee instanceof BaseEmployee){
            System.out.printf("|%-10s |%-9s |%-12s |%-6s |%-4s |%-5s |%-4s |%-6s |$%-5s",
                    employee.getFirstName(), employee.getLastName(), employee.getSocSecNumber(), "",
                    "", "", "", "", ((BaseEmployee) employee).getBaseSalary());
        }

    }
}