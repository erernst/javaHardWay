public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, employeeNumber;
		double seconds, e, checking, years;
		String firstName, lastName, title, js, status;
		
		x = 10;
		y = 400;
		age = 39;
		employeeNumber = 34;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		years = 1.76;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		js = "Junior";
		status = "Employed";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" ); 
		System.out.println( "My names' " + title + " " + firstName + lastName );
		System.out.println( "Employee #" + employeeNumber + " has worked " + years + " years, is currently " + status + ".");
		System.out.println( js );
	}
}