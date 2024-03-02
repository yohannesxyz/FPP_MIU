package lab3;

public final class Triangle {
private final double base;
private final double height;

public Triangle(int base, int height) {
	this.base=base;
	this.height=height;
}
public double computeArea() {
	return 0.5*base*height;
}
public double getBase() {
	return base;
	
}
public double getHeight() {
	return height;
	
}
}
