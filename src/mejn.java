import java.util.Scanner;
public class mejn {
	
	static int current_question, difficulty = 0;
	
	public static void main(String[] args) {
		// initialization
		Scanner kb = new Scanner(System.in);
		Player hrac = new Player();
		Questions questions = new Questions();
		
		System.out.println("Vitajte v hre milionar!");
		//game
		for(int counter = 0; counter<10; counter++) {
			System.out.println("Vas bank je: " + hrac.konto);
			questions.printout();
			current_question = (kb.nextInt()-1);
			
			if(questions.ask()) {
				hrac.addition(counter);
				questions.removal(current_question);
				if(counter>1 && counter<6)
					difficulty=1;
				else if(counter>=6)
					difficulty=2;
				wipeout();
			}	
			else {
				System.out.println("Prehral si.");
				kb.close();
				System.exit(0);
			}
		}
		System.out.print("GRATULUJEM! Stal si sa Milionarom!");
		
	}
	public static void wipeout() {
		for(int i=0;i<25;i++)
			System.out.println();
	}
}
