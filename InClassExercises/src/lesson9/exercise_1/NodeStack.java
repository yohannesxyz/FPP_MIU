package lesson9.exercise_1;
@SuppressWarnings("unused")
public class NodeStack {
	private Node top;
	
	public void push(String s) {
		//implement
		Node n= new Node();
		n.data=s;
		n.next=top;
		top=n;
	}
	public String peek() {
		if(top!=null) {
			return top.data;
		}
		return null;
	}
	public String pop() {
		if(top!=null) {
			String n= top.data;
//			alternatively  we can use String n = peek();
			
			top=top.next;
			return n;
		}
		return null;
	}

public static void main(String[] args) {
		NodeStack stack = new NodeStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.peek());
		System.out.println(stack.top.toString());
		System.out.println(stack.pop());
		System.out.println(stack.top.toString());
		
	}
}