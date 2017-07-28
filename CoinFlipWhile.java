import java.util.Scanner;

public class CoinFlipWhile {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String coin, again = "y";
		int streak = 0;
		double gotHeads = 10*Math.random();
		
		
		while ( ! again.equals("n")){			
			if ( gotHeads < 5 ){
				coin = "HEADS";
				streak++;
				System.out.println("You flip a coin and it is..." + coin);
				System.out.println("\tThat's " + streak + " in a row....");
				System.out.print("\tWould you like to flip again (y/n)?");
				again = keyboard.next();
			}
			else {
				coin = "TAILS";
				System.out.println("You flip a coin and it is..." + coin);
				System.out.println("\tYou lose everything!");
				System.out.println("\tShould've quit while you were aHEAD....");
				streak = 0;
				again = "n";
			}
			
		}
		System.out.println( "Final score: " + streak );
	}
}
	
		