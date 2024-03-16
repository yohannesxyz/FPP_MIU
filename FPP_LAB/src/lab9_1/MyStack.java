package lab9_1;

public class MyStack {
	private MyStringLinkedList list;
	public MyStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() {
		//implement
		String first= peek();
		if(first!="null") {
		list.remove(0);
		}
		return first;
	}
	public String peek() {
		//implement
		return list.get(0);
	}
	
	public void push(String s) {
		//implement
		list.insert(s,0);
	}
	public static void main(String [] args) {
	MyStack stack = new MyStack();

	stack.push("Bob");
	stack.push("Harry");
	stack.push("Alice");
	System.out.println("Popping…"+stack.pop());
	System.out.println("Peeking…."+stack.peek());
	System.out.println("Popping…"+stack.pop());

	
	}
}
