package Prob2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static class EmployeeComparator implements Comparator<Employee>{
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getSsn().compareTo(e2.getSsn());
		}
	}
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		if (table == null || socSecNums == null) return new ArrayList<>();

		List<Employee> empReport = new ArrayList<>();
		Collection<Employee> givenEmps = table.values();
		for (String sn: socSecNums){
				for (Employee e: givenEmps){
					if(e.getSsn() != null && e.getSsn().equals(sn) && e.getSalary() > 80000){
						empReport.add(e);
					}
				}
		}
		Comparator<Employee> empComp = new EmployeeComparator();
		Collections.sort(empReport, empComp);
		return empReport;
		
	}
	
}
