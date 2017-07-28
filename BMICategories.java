

import java.util.Scanner;

public class BMICategories {
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
		
		System.out.println( "BMI: " + bmi);
		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0) { 
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println ( "very severely/\"morbidly\" obese" );
		}
		//noticed how line 21 broke rank and still checked its own if statement, fixed code to original
	}
}
		