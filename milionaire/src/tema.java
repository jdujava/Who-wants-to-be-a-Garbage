import java.util.ArrayList;
import java.util.Arrays;

public class tema {
	private ArrayList<otazka> otazky = new ArrayList<otazka>();
	public tema () {
		for(int i = 0;i<questions.spravnee.length;i++)
			questions.spravne.add(questions.spravnee[i]);
		for(int i = 0; i<3; i++) {
			otazky.add(new otazka(questions.otazocky.get(mejn.question_counter),questions.spravne.get(mejn.question_counter)));
			mejn.question_counter++;
		}	
	}
	public void call(int current_question,int difficulty){
		otazky.get(difficulty).print_question(current_question,difficulty);
	}
}
