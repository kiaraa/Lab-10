package co.gc;

public class Circle {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		return Math.PI * 2 * this.radius;
	}
	
	public double getArea() {
		return Math.pow((Math.PI * this.radius), 2);
	}
	
	private static String formatNumber(double x) {
		return String.format("%.2f", x);
	}
	
	public String getFormattedCircumference() {
		return Circle.formatNumber(this.getCircumference());
	}
	
	public String getFormattedArea() {
		return Circle.formatNumber(this.getArea());
	}
}
