package tests;

import java.util.HashMap;

class TheClass {
//	public static void test() throws Exception {
//		try {
//			
//			throw new Exception("Exception thrown");
//		
//		} catch (Exception x) {
//			System.out.println(x.getMessage());
//			System.out.println("in catch");
//			return;
//		} finally {
//		
//			System.out.println("In finally block!");
//			return;
//		}
//		System.out.println("In test method");
//	}

	public static void main(String[] args) {
//		try {
//			test();
//		} catch (Exception x) {
//			System.out.println(x.getMessage());
//		}
//	}
		
		HashMap<Integer, Integer> Marks = new HashMap<>();
        Marks.put(201, 190);
        Marks.put(210, 199);
        Marks.put(206, 180);
        Marks.put(203, 190);
        Marks.put(null, null);

        // Printing all values
        for (Integer val : Marks.keySet()) {
            System.out.println(val);
        }
        System.out.println();
		
	}
}