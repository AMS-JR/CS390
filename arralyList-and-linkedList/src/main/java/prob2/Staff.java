package prob2;

public final class Staff implements EmployeeData{
	private String name;
	private double salary;
	private int numDependants;
	public Staff(String name, double salary, int numDependants) {
		this.name = name;
		this.salary = salary;
		this.numDependants = numDependants;
	}
	
	public String getName() {
		return name;
	}

//	@java.lang.Override
//	public java.lang.String toString() {
//		return "Staff{" +
//				"name='" + name + '\'' +
//				", salary=" + salary +
//				", numDependants=" + numDependants +
//				'}';
//	}

	@Override
	public double getSalary() {
		return salary;
	}

	public int getNumDependants() {
		return numDependants;
	}
}
