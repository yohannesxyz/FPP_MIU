package lesson4.comparable;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;


class Employee implements Comparable<Employee> {
	private String aString;
	Employee(String s){
		aString=s;
	}
	private String name;
	private int salary;
	private LocalDate hireDay;
	// constructor
	Employee(String aName, int aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		hireDay = LocalDate.of(aYear,  aMonth, aDay);
	}

	// instance methods
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += Math.round(raise);
	}
	
	@Override
	public String toString() {
		return aString;
	}

	@Override
	public int compareTo(Employee s) {
		if(aString.length()<s.aString.length()) {
			return -1;
		}
		else if(aString.length()>s.aString.length()) {
			return 1;
		}
		else return 0;
		
	}
	
	public static void main(String[] args) {
		Employee[] empArray = {new Employee("Dave"),new Employee("Bob"),
				
				new Employee("Tim") 
		};
				
		Arrays.sort(empArray);
		System.out.println(Arrays.toString(empArray));
	}
	
	
	
}
