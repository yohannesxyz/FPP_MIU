package lesson3.exercise_4;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int s) {
		salary = s;
	}
	
	public String toString() {
		return name + ":" + salary;
	}
}



