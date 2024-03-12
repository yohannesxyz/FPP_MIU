package lesson7.exercise_2;

public class Fib {
	
	public int fib(int n) {
		//implement
		if(n==1||n==0) return 0;
		int a1 = 0; 
		int a2=1;
		int sum =0;
		for(int i = 1; i<=n-2;i++) {
			sum = a1+a2;
			a1=a2;
			a2=sum;
			if(i==n-2) return sum;
		}
		return 0;
		
	}	
	
	public static void main(String[] args) {
		Fib f = new Fib();
		System.out.println(f.fib(5));
		
	}
}


