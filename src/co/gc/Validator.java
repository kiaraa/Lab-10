package co.gc;

public class Validator {
	public static boolean isValidRadius(double radius) {
		if (radius > 0.0) {
			return true;
		}
		else {
			return false;
		}
	}
}
