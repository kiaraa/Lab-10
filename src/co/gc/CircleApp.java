package co.gc;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int circleCount = 0;
		boolean keepGoing = false;
		
		System.out.println("Welcome to the circle tester!");
		
		do {
			System.out.println("Enter radius: ");
			double radius = scan.nextDouble();
			
			if (Validator.isValidRadius(radius)) {
				Circle userCircle = new Circle(radius);
				circleCount++;
				System.out.println("Circumference: " + userCircle.getFormattedCircumference());
				System.out.println("Area: " + userCircle.getFormattedArea());
				
				keepGoing = getContinue(scan);
			}
			else {
				System.out.println("Please enter a decimal value greater than 0.");
				keepGoing = true;
				continue;
			}
			
		} while (keepGoing);
		
		System.out.println("Thank you for using the circle tester! You tested " + circleCount + " circles today.");
		
		
		

	}
	
	public static boolean getContinue(Scanner scan) {
		scan.nextLine();
		System.out.println("Would you like to continue? (y/n) ");
		if (scan.nextLine().equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}

}
