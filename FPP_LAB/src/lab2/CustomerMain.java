package lab2;



public class CustomerMain {
	
public static void main(String Args[]) {
		
	
	Customer c1 = new Customer("jow","nny","1234");
	Customer c2 = new Customer("mim","yuy","678");
	Customer c3 = new Customer("xux","ttt","000");
	
	Address add1A = new Address("10 Adams", "Fairfield", "IA", "52556");
	Address add1B = new Address("110 Burlington", "Chicago", "IA", "52556");
	Address add2A = new Address("322 Harrison", "Chicago", "IA", "52556");
	
	c1.setbillingAddress(add2A);
	c2.setbillingAddress(add1A);
	c3.setbillingAddress(add1B);
	
	Customer[] c = new Customer[3];
	c[0]=c1;
	c[1]=c2;
	c[2]=c3;
	
	for(int i=0;i<c.length;i++) {
		Address ad= c[i].getbillingAddress();
		if(ad.getCity().equals("Chicago")) {
			System.out.println("the chicago guy is:"+c[i].toString());
		}
	}
	}

}
