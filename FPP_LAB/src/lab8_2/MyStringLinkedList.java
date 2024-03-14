package lab8_2;

public class MyStringLinkedList {
	Node header;
	MyStringLinkedList(){
		header = new Node(null);
	}
	/******* sorting methods ********/
	public void minSort(){
		//implement
		int len = size();
		if(header.next== null || len <=1) return;
//		for(int i = 0; i < len; ++i){
		Node initial= header.next;
//		Node current = initial.next;
		Node temp= initial;
		while(temp.next!=null) {
			Node nextMinPos = minpos(temp);
			swap(initial,nextMinPos); 
			initial=initial.next;
			temp=temp.next;
		}
	}
	void swap(Node n1, Node n2){
		//implement
		
		String temp= n1.value;
		n1.value=n2.value;
		n2.value=temp;
		
	}
	//find minimum value having node and return it
	public Node minpos(Node cur){		
		String m = cur.value;
		
		Node index = cur;
		Node temp=cur.next;
		while(temp!=null) {
			if(temp.value.compareTo(m)<0) {
				m=temp.value;
				index=temp;
			}
			temp=temp.next;
		}
		return index;
	}

	/********* end sorting methods ********/
	
	
//	remove the first element found
	boolean remove(String data) {
		if(size()==0) return false;
		if (header.next.value.equals(data)) {
	        if (size() == 1) {
	            header.next = null;
	        } else {
	            header.next = header.next.next;
	            if (header.next != null) {
	                header.next.previous = header;
	            }
	        }
	        return true;
	    }
		Node temp=header.next;
		while(temp!=null) {
			if(temp.value.equals(data)) {
				if(temp.next!=null) {
				temp.next.previous=temp.previous;
				}
				temp.previous.next=temp.next;
				
				temp=null;
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
//	adds data to the position on the list
	void insert(String data, int pos) {
		Node n = new Node(data);
		if(pos<0||pos>=size()) throw new IllegalArgumentException("Illegal position for new node");
		
		if(pos==0)addFirst(data);
		Node temp= header;
		for(int i=0; i<=pos;i++) {
			temp=temp.next;
		}
		n.next=temp;
		n.previous=temp.previous;
		temp.previous=n;
		n.previous.next=n;
		
		
	}
int size() {
	if(header.next==null) return 0;
	int size=0;
	Node temp=header;
	while(temp.next!=null) {
		size++;
		temp=temp.next;
	}
	return size;
}
	
	//adds to the front of the list
	public void addFirst(String item){
		Node n = new Node(item);
		//place new node after header and 
		//establish links from new node to 
		//surrounding nodes
		n.next = header.next;
		n.previous = header;
		
		//establish links from surrounding 
		//nodes to the new node
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;	
	}
	
	//adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		//find last node
		Node last = header;
		while(last.next != null) {
			last = last.next;
		}
		//now last.next == null
        last.next = n;
        n.previous = last;
	}
	
	//removes node in last position
	public void removeLast( ) {
		//if list is empty, return
		if(header.next == null) return;
		
		Node current = header;
		//traverse the list until current.next is 
		//null - then remove current
		while(current.next != null) {
			current = current.next;
		}
		//now current.next == null, so remove current
		Node previous = current.previous; 
		//previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}
	
	//determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while(next != null && !next.value.equals(s)) {
			next = next.next;
		}
		//either next == null or next.value is s
		if(next == null) return false;
		else {//next.value.equals(s) 
			return true;
		}
	}
	public String toString() { 
		var sb = new StringBuffer();
		Node next = header.next;
		while(next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if(result.length() == 0) return "<empty list>";
		if(result.charAt(result.length()-1) == ',') {
			return result.substring(0,result.length()-1);
		}
		return result;			
	}
	class Node {
		String value;
		Node next;
		Node previous;
		Node(String value){
			this.value = value;
		}
		
		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args){
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");
		System.out.println(list);
		list.remove("Tom");
		System.out.println(list);
		list.remove("Harry");
		System.out.println(list);
		list.remove("Steve");
		System.out.println(list);
String[] testArr = {"big", "small", "tall", "short", "round", "square",
		"enormous", "tiny","gargantuan", "lilliputian",
		"numberless", "none", "vast", "miniscule"};
for(String s:testArr) {
	list.addLast(s);
}
		
		list.minSort();
		System.out.println(list);
		
	}
}
