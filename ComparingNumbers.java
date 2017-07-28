import java.util.Scanner;

public class ComparingNumbers {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double first, second;
		
		System.out.print( "Give me two numbers. First: " );
		first = keyboard.nextDouble();
		System.out.print( "Second: " );
		second = keyboard.nextDouble();
		
		if ( first < second ) 
			System.out.println( first + " is LESS THAN " + second );
		if ( first <= second ) 
			System.out.println( first + " is LESS THAN/EQUAL TO " + second );
		if ( first == second ) 
			System.out.println( first + " is EQUAL TO " + second );
		if ( first >= second ) 
			System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
		if ( first > second ) 
			System.out.println( first + " is GREATER THAN " + second );
		if ( first != second ) {
			System.out.println( first + " is NOT EQUAL TO " + second);
			System.out.println ( "Hey." );
		}
		//1 yes the hey is there no matter what, it is not regarded as part of the body and is not dependent on the if statement
		//2 everything works as expected, the rest of the body statements are only 1 line and do not need curly braces
	}
}
