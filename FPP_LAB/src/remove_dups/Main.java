package remove_dups;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] x = {1,1,2,2,3,3};
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	List<Integer> myList = new ArrayList<Integer>();
	for(int i:x) {
		if(!map.containsValue(i)) {
		map.put(i, i);
		myList.add(i);
		}
	}
Iterator<Integer> it = myList.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	
}
}