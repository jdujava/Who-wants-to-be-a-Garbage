import java.util.Scanner;
public class mejn {
	
	static int answer_counter = 0;
	static int question_counter = 0;
	static int correct;
	static boolean decision = false;
	
	public static void main(String[] args) {
		// initialization
		Scanner kb = new Scanner(System.in);
		player hrac = new player();
		questions otazky = new questions();
		int current_question,difficulty = 0;
		int counter = 1;
		
		System.out.println("Vitajte v hre milionar!");
		//game
		while(counter<10) {
			System.out.println("Vas bank je: " + hrac.konto);
			otazky.printout();
			current_question = (kb.nextInt()-1);
			questions.ask(current_question,difficulty);
			if(decision==true) {
				hrac.addition(counter-1);
				questions.removal(current_question);
				if(counter+1>3 && counter<7)
					difficulty=1;
				else if(counter+1>=7)
					difficulty=2;
				wipeout();
			}	
			else {
				System.out.println("Prehral si.");
				System.exit(0);
			}
			counter++;
		}
		System.out.print("GRATULUJEM! Stal si sa Milionarom!");
		
	}
	public static void wipeout() {
		for(int i=0;i<25;i++)
			System.out.println();
	}
}
