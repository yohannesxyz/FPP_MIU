package lesson8.exercise_5;
import java.util.*;
import java.util.function.Consumer;
public class Main {
	public static void main(String[] args) {
		List<Employee> aList = Arrays.asList(new Employee("Bob", 20000),
				new Employee("Harry", 60000), new Employee("Steven", 30000),
				new Employee("Regis", 50000),new Employee("Tony", 40000));
		System.out.println(empsToNames(aList));
	}

	static List<String> empsToNames(List<Employee> list) {
		// use the new forEach method to return in a list
		// the names of the Employees in the input list
//		Iterator x = list.iterator();
		var names = new ArrayList<String>();
		list.forEach(e->names.add(e.getName()));
//		list.forEach(new Consumer<Employee>() {
//
//			@Override
//			public void accept(Employee t) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
		
		return names;
	}
}
