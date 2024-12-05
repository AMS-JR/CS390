package employee_management;

import java.time.LocalDate;

public class DeptEmployee {

    private String name;
    private double salary;
    private LocalDate hireDate;

    public DeptEmployee (String name, int hYear, int hMonth, int hDay, double salary){
        this.name = name;
        this.hireDate = LocalDate.of(hYear,hMonth, hDay);
        this.salary = salary;
    }

    public double computeSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

}
