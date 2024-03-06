package lab4.q1;

import java.util.Date;

public class Secretary extends DeptEmployee {
double overtimeHours;

Secretary(String n,Date hire, int num){
	 super.setName(n);
	 super.setDate(hire);
	 this.overtimeHours=num;
	 salary=300;
}

@Override
public double computeSalary() {
	return salary+12*overtimeHours;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
