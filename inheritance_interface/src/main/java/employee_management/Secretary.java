package employee_management;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    double overtimeHours;

    public Secretary(String name, int hYear, int hMonth, int hDay, double salary, double overtimeHours) {
        super(name, hYear, hMonth, hDay, salary);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return (overtimeHours*12) + super.computeSalary();
    }
}
