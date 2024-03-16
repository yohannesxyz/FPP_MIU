package lab9_4;

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;
	
	/* stores the element at the end of the queue, if it exists */
	private Node tail;
	
	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		//implement
		Node n= new Node();
		n.data=s;
		if(head==null) {
			head=tail=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
	}	
	/**
	 * Removes node from the front of the queue and returns its value if
	 * head is n
	 */
	public String dequeue() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		
		
			String curData= head.data;
			head=head.next;
			return curData;
		
		
	}	
	/**
	 * Returns value stored at the front of the queue
	 * @return
	 * @throws QueueException
	 */
	public String peek() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		return head.data;
	}
	public boolean isEmpty() {
		return head == null;
	}
	@Override
	public String toString() {
		if(isEmpty()) return "<empty queue>";
		return head.toString();
	}
	
	public static void main(String [] args) throws QueueException {
		NodeQueue q= new NodeQueue();
		q.enqueue("Bob");
		q.enqueue("Harry");
		q.enqueue("Alice");
		System.out.println(q);
		System.out.println("enqueuing…"+q.dequeue());
		System.out.println("Peeking…."+q.peek());
		System.out.println("dequeuing…"+q.dequeue());
		System.out.println("dequeuing…"+q.dequeue());
		char c ='c';
				System.out.println(c);
//		System.out.println("dequeuing…"+q.dequeue());
	}
	
}


