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
		List<Integer> newList = new LinkedList<Integer>(listOf(1,2));
		Set<Student> newS = new HashSet<Student>(newList);
		newList.clear();
		newList.addAll(newS);
		Object [] arr = {1,2,3};
		List<Integer> b = Arrays.asList(arr);
//		List<Student> newList = (List<Student>)Arrays.asList(studentArray);
//		for(Object b:studentArray) {
//			if(b instanceof Student) {
//				newList.add((Student)b);
//			}
//		}
//		Collections.addAll(newList, studentArray);
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
