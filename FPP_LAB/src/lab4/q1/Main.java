package lab4.q1;

import java.util.Date;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		Professor p1 = new Professor("Andrew",new Date(124,12,4),10);
		Professor p2 = new Professor("Johnny",new Date(123,11,1),10);
		Professor p3 = new Professor("Imed",new Date(122,2,3),10);
		
		Secretary s1 = new Secretary("hilina", new Date(111,5,8),200);
		Secretary s2 = new Secretary("beti",new Date(123,5,9),200);
		
		
		DeptEmployee[] dep =  {p1,p2,p3,s1,s1};
		
		System.out.println("Do you wanna see the magic?");
		String Y = sc.nextLine();
		sc.close();
		double sum=0;
		if(Y.equals("Y")) {
			
			for(DeptEmployee d:dep) {
				sum+=d.computeSalary();
			}
		}
		System.out.println(sum);
	}

}
