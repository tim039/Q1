import java.util.Scanner;
public class QBStatistics {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// Variables
		
		
		double ATT;
		double COMP;
		double YDS;
		double TD;
		double INT;
		
		double a;
		double b;
		double c;
		double d;
		
		double PasserRating;
		// User Input
		
		System.out.println("Number of passing attempts");
		ATT = input.nextDouble();
		
		
		System.out.println("Number of completions");
		COMP = input.nextDouble();
		
		
		System.out.println("Passing yards");
		YDS = input.nextDouble();
		
		
		
		System.out.println("Touchdown passes");
		TD = input.nextDouble();
		
		
		
		System.out.println("Interceptions");
		INT = input.nextDouble();
		
		
		// Equations
		
		a = ((COMP/ATT) - .3) * 5;
		
		b = ((YDS/ATT) - 3) * .25;
		
		c = (TD/ATT) * 20;
		
		d = 2.375 - ((INT/ATT) * 25);
				
		PasserRating = ((a + b + c + d) / 6) * 100;
		
		// Final Output
		
		System.out.println("The Passer rating is " + PasserRating);
				
		
				
		
	}
}
