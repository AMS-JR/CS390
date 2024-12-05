package employee_management;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
    // Sample Professors and Secretaries
    DeptEmployee p1 = new Professor("Alexander", 2022,10,23, 200000, 5);
    DeptEmployee p2 = new Professor("Aldo", 2019,8,30,50000,6);
    DeptEmployee p3 = new Professor("Andrew", 2018,3,21,45000,4);
    DeptEmployee sec1 = new Secretary("Sam", 2019, 2,2,35000,40);
    DeptEmployee sec2 = new Secretary("Shamira", 2023,5,25,150000,30);

    DeptEmployee[] emps = new DeptEmployee[5];
    emps[0]  = p1;
    emps[1] = p2;
    emps[2] = p3;
    emps[3] = sec1;
    emps[4] = sec2;

    double salarySum = 0.0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Do you want to see the salary sum? Y/N");
    String input;
    input = sc.nextLine();
    if (input.equalsIgnoreCase("Y")) {
        for (DeptEmployee e : emps) {
            salarySum += e.computeSalary();
        }
        System.out.println("Total employees salary is: " + salarySum);
        System.out.println("Average salary is: " + (salarySum / emps.length));
    }
    else sc.close();
}
}
