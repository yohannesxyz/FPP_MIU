package lab9_3;;



public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	public int size() {
		return size;
	}
	public void enqueue(int a) {
		if(rear==arr.length) {
			resize();
		}
		arr[rear]=a;
		rear++;
		size++;
		if(front==-1)front=0;
	}
	void resize() {
		System.out.println("resizing");
		int [] temp = new int[rear*2];
	System.arraycopy(arr, 0, temp, rear, size);
		arr=temp;
		front=0;
		rear=size;
	}
	public int dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException("Cannot peek because Queue is empty!") ;
		}
		else {
			size--;
			front++;
			return arr[front-1];
		
			
		}
	}
	public int peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Cannot peek because Queue is empty!") ;
		}
		else {
			return arr[front];
		}
	
	
	}

	
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
//		uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}

