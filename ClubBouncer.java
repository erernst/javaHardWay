public class ClubBouncer {
	public static void main( String[] args ) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";
		
		if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
			System.out.println("You are allowed to enter the club");
		}
		else {
			System.out.println("You are not allowed ot enter the club.");
		}
		// the program would not compile with code between lines 10 and 11, it separated the else from the if
	}
}