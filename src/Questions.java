import java.util.ArrayList;

public class Questions {
	public ArrayList<Tema> temy = new ArrayList<Tema>();
	
	public Questions(){
		for(int i = 0; i<data.themes_1.length; i++)
			temy.add(new Tema(i));
	}
	
	public void printout () {
		for(int i=0; i<temy.size();i++)
			System.out.println((i+1) + "." + temy.get(i).name);
		System.out.print("Vyberte si temu: ");
	}
	
	public boolean ask(){
		if(temy.get(mejn.current_question).call()) return true;
		return false;
	}
	
	public void removal(int zmazat) {
		temy.remove(zmazat);		
	}	
}
