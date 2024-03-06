package lab4.q1;

import java.util.Date;

public class Professor extends DeptEmployee{
	 private int numberOfPublications;
	 
	 Professor(String n,Date hire, int num){
		 super.setName(n);
		 super.setDate(hire);
		 this.numberOfPublications=num;
		 salary=500;
	 }
	 
	 public void setNumberOfPublications(int d) {
			this.numberOfPublications=d;
		}
		public int getNumberOfPublications () {
			return this.numberOfPublications;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
