package lab8_3;

import java.util.Comparator;
import java.util.Date;

public class HireDateComparator implements Comparator<Employee> {
	
	@Override
public int compare(Employee emp1, Employee emp2) {
		
	String name1=emp1.getName()	;
	String name2=emp2.getName();
	Date d1=emp1.getHireDate();
	Date d2=emp2.getHireDate();
	int s1=emp1.getSalary();
	int s2=emp2.getSalary();
	
		if(d1.compareTo(d2)!=0) {
			return d1.compareTo(d2);
		}
		else {
			if(name1.compareTo(name2)!=0) {
				return name1.compareTo(name2);
			}else {
				if(s1<s1) {
					return -1;
				}
				else if(s1>s2) {
					return 1;
				}
			}
			
		}
	return 0;
}
	
	
	
	
}
