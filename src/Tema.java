import java.util.ArrayList;

public class Tema {
	private ArrayList<Otazka> otazky = new ArrayList<Otazka>();
	public String name;
	
	public Tema (int i) {
		name = data.themes_1[i];
		for(i = 0; i<3; i++) {
			otazky.add(new Otazka());
			data.question_counter++;
		}	
	}
	public boolean call(){
		if(otazky.get(mejn.difficulty).print_question()) return true;
		return false;
	}
}
