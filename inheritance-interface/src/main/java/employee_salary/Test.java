package employee_salary;

public class Test {

    public static  void main(String[] args){
        Employee[] emp = {
                new BasePlusCommissionEmployee("Arnold", "Nsubuga", "3215",56000,20,2000),
                new BasePlusCommissionEmployee("Hilary", "Asiimwe", "32157",67000,30,50000),
                new HourlyEmployee("Marvin","Male","4567",500,100),
                new SalariedEmployee("Mathew","Luwaga","3234",4000),
                new CommissionEmployee("Cathy","Sheilah","8907",4300,50)
        };
        System.out.println(findMaxSalary(emp));
    }

    public static Employee findMaxSalary(Employee[] coll){
        // Check if the array is null or empty
        if (coll == null || coll.length == 0) {
            return null; // Return null to indicate no employee exists
        }
        double maxSalary = 0.0;
                Employee maxEmp = null;
                for(Employee e: coll){
                    if (e.getPayment() > maxSalary){
                        maxSalary = e.getPayment();
                        maxEmp = e;
                    }
                }
                return maxEmp;
    }
}
