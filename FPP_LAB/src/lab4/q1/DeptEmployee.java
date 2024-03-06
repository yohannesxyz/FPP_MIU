package lab4.q1;

import java.util.Date;

public class DeptEmployee {

	private String name;
	private Date hireDate;
	protected double salary;
	
	protected double computeSalary() {
		return salary;
	}
	
	public void setName(String n) {
		this.name=n;
	}
	public String getName () {
		return this.name;
	}
	
	public void setDate(Date d) {
		this.hireDate=d;
	}
	public Date getDate () {
		return this.hireDate;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
