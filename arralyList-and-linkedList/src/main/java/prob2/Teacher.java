package prob2;

public final class Teacher implements  EmployeeData{
	private double bonus;
	private String name;
	private double salary;
	public Teacher(String name, double salary, double bonus) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	@Override
	public double getSalary() {
		return salary + bonus;
	}

//	@java.lang.Override
//	public java.lang.String toString() {
//		return "Teacher{" +
//				"bonus=" + bonus +
//				", name='" + name + '\'' +
//				", salary=" + salary +
//				'}';
//	}

	public double getBonus() {
		return bonus;
	}
	public String getName() {
		return name;
	}
}
