package employee_management;

import java.time.LocalDate;

public class Professor extends DeptEmployee {

    private int numberOfPublications;

    public Professor(String name, int hYear, int hMonth, int hDay, double salary, int numberOfPublications) {
        super(name, hYear, hMonth, hDay, salary);
        this.numberOfPublications = numberOfPublications;
    }


    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
