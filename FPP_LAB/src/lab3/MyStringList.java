package lab3;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] vocab;
	private int size;

	
	public MyStringList() {
		vocab = new String[INITIAL_LENGTH];
		size = 0;
	}
	public MyStringList(int size) {
		this.size = 0;
		vocab = new String[size];
	}

	public void add(String s) {
		
		if (size == vocab.length) {
		resize();
		}
		vocab[size] = s;
		size++;
	}

	public String get(int i) {
		return vocab[i];
	}

	public boolean find(String s) {
		boolean check = false;
		for (int i = 0; i < vocab.length; i++) {
			if (s.equals(vocab[i]))
				check = true;
		}
		return check;
	}

	public int findIndex(String s) {
		for (int i = 0; i < vocab.length; i++) {
			if (s.equals(vocab[i]))
				return i;
		}
		return -1;
	}

	public boolean remove(String s) {

		int index = findIndex(s);
		if (index >= 0) {
//			System.out.print(index);
			System.arraycopy(vocab, index + 1, vocab, index, vocab.length - index - 1);
//			System.out.print(Arrays.toString(vocab));
			size--;
			return true;
		}
		return false;
	}
	
	
	
	public int size() {
		return size;
	}
	private void resize() {
		
	    System.out.println("Resizing...");

//		vocab=Arrays.copyOf(vocab, size);
	    String[] arr = new String[vocab.length*2];
	    
		System.arraycopy(vocab, 0, arr, 0, size);
		vocab=arr;
		
		
	}
	

	public String toString() {
String [] str = new String[size];
for(int i=0;i<size;i++) {
	str[i]=vocab[i];
}
return Arrays.toString(str);
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
	}

}
