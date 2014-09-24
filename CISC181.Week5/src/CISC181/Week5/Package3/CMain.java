package CISC181.Week5.Package3;

public class CMain {
	public static void main(String[] args) {
		double mass;
		mass = 200;
		for (Planet p : Planet.values()) {
			System.out.printf("Your weight on %s is %f%n", p,
					p.surfaceWeight(mass));
		}
		
		// Planet p1 = new Planet(); <<- you can't do this!  You can't create an instance of an enum.		
		
		int count = 5; 
		double amount = 45.56; 
		System.out.printf("count is %d and amount is %f", count, amount); 
	}
}
