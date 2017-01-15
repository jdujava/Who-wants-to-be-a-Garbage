import java.util.ArrayList;
import java.util.Scanner;

public class Otazka {
	Scanner kb = new Scanner(System.in);
	private ArrayList<String> moznosti = new ArrayList<String>();
	private String znenie;
	private int spravnaOdpoved;
	
	public Otazka() {
		znenie = data.otazockas[data.question_counter];
		spravnaOdpoved = data.spravne[data.question_counter];
		for(int i = 0;i<3;i++){
			moznosti.add(data.odpovedes[data.question_counter * 3 + i]);	
		}
	}
	
	public boolean print_question() {
		System.out.println(znenie);
		for(int i = 0; i<3; i++)
			System.out.println((i+1)+ ". " + moznosti.get(i));
		
		System.out.print("Zadajte spravnu odpoved: ");
		if((kb.nextInt()-1) == spravnaOdpoved)
			return true;
		else
			return false;
	}
}
