package lesson4.closedcurve.good;

public  class Circle extends ClosedCurve {
	int x = 5;
	private final double radius;
	public Circle(){
		radius=3;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return (Math.PI * radius * radius);
	}
}
