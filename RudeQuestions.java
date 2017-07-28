import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int questions, age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "How many questions do you want to answer? " );
		questions = keyboard.nextInt();
		
		System.out.print( "Good to hear that you are willing to answer " + questions + ", however I have 4 questions to ask.\n" );
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? that's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + ".");
		// the program does not blow up if you enter an integer value when it is expecting a double because an integer is a whole number 26 and 26.0 are the same thing, the program just converts it
		// string seems to simply use whatever text is entered into the variable so a number is just another form of text for it
		// the age question blows up with either letters or numbers with decimals, it needs an integer, so a whole number, the weight and income questions blow up with any text as they need any number to run properly
	}
}