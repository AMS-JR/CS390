package prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		if(aList == null) return 0.0;
		double sum = 0.0;
		for (EmployeeData ed: aList){
			sum += ed.getSalary();
		}
		return sum;
	}
}
