public class ThereAndBackAgain {
	public static void main( String[] args ) {
		System.out.println( "Here." );
		erebor();
		System.out.println( "Back first time." );
		// erebor();
		System.out.println( "Back second time." );
	}
	// when you remove the parentheses it does not compile as it does not recognize erebor
	// it will just compile and not have a second there, i was correcct
	public static void erebor() {
		System.out.println( "There." );
	}
}