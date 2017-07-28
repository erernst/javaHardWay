import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double  ft, in, m, lbs, kg, bmi;
		
		System.out.print( "Your height (feet only): ");
		ft = keyboard.nextDouble();
		System.out.print( "Your height (inches): " );
		in = keyboard.nextDouble();
		m = (ft * 12 + in) / 39.3701;
		
		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();
		kg = lbs / 2.20462;
		
		bmi = kg / (m*m);
		
		System.out.println( "YourBMI is " + bmi );
	}
}