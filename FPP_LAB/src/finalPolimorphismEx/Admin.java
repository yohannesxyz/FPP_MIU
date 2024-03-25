package finalPolimorphismEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		/* implement */		
		
		List<Student> newList = new ArrayList<Student>();
		for(Object b:studentArray) {
			if(b instanceof Student) {
				newList.add((Student)b);
			}
		}

		return newList;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		/*implement */
		double e1=0.0;
		int count=0;
		for(Student s :studentList) {
			e1+=s.computeGpa();
		}
		
	
	return e1/studentList.size() ;
}
}
