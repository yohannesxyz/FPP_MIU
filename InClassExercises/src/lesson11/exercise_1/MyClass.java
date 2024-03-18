package lesson11.exercise_1;

import java.util.Objects;

public class MyClass {
	private int val;
	public MyClass(int x) {
		val = x;
	}
	public int getVal() {
		return val;
	}
	//implement
	@Override
	public int hashCode() {
		return 2; //this will make every item added be put to the same place
//		return Objects.hash(val); //this will vary thinsg up
	}
	@Override
	public String toString() {
		return "MyClass object #" + val;
	}
	public static void main(String[] args) {
		MyClass cl1 = new MyClass(1);
		MyHashtable hashtable = new MyHashtable();
//		hashtable.put(cl1, 1);
		for(int i=0;i<9;i++) {
			hashtable.put(new MyClass(i), i);
		}
//		System.out.println(hashtable.toString());
		hashtable.printTable();
	}
}
