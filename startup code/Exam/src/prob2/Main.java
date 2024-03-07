package prob2;

public class Main {

	public static void main(String[] args) {

		BoardingTime[] objs = { new FirstClass(Status.SILVER), new BusinessClass(Status.GOLD), new EconomyClass(441)};
		//expected output: 26.7
		System.out.println(Main.computeAverageBoardingTime(objs));

	}

	//Modify this code
	public static double computeAverageBoardingTime(BoardingTime[] objs) {
		double sum = 0;
		for (BoardingTime o : objs) {
//			}
			sum += o.computeBoardingTime();
		}
		return sum / objs.length;
	}
}
