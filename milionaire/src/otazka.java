import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class otazka {
	Scanner kb = new Scanner(System.in);
	private ArrayList<String> moznosti = new ArrayList<String>();
	private String name;
	private int spravnost;
	public otazka(String otazka, int spravne) {
		name = otazka;
		spravnost = spravne;
		for(int i = 0;i<3;i++){
			moznosti.add(questions.odpovede.get(mejn.answer_counter));
			mejn.answer_counter++;			
		}
			
	}
	public void print_question(int current_question, int difficulty) {
		System.out.println(name);
		for(int i = 0; i<3; i++)
			System.out.println((i+1)+ ". " + moznosti.get(i));
		
		System.out.print("Zadajte spravnu odpoved: ");
		mejn.correct = (kb.nextInt()-1);
		if(mejn.correct==questions.spravne.get(current_question*3+difficulty))
			mejn.decision=true;
		else
			mejn.decision=false;
	}
}
