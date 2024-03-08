package prob2;

public class BusinessClass implements BoardingTime {
	static final int x =0;
	Status status;


	public BusinessClass(Status status)  {
		super();
		this.status = status;
	}

	public double computeBoardingTime() {
		
		
		switch (status) {
		case GOLD:
			return 10;
		case SILVER:
			return 20;
		default:
			return 30;
		}
	}

}
