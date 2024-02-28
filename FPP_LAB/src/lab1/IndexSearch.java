package lab1;

public class IndexSearch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(search(new int[] {1,3,4,5},5));
	}
	
	public static int search(int arr[], int target) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) return i;
		}
		return -1;
	}

}
