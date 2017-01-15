import java.util.ArrayList;
import java.util.Arrays;

public class questions {
	static String[] themes_1 = {"Sport","Cestovanie","IT","Random","Auto-moto","Slovensko","Veda","Zvierata","film"};
	static String[] otazockas = {"Kto na OH 2016 vyhral zlatu medialu pre Slovensko?", "Ktory hrac NHL ziskal najviac bodov v historii?","kto nahraval Bondrovi na vitazny gol proti Rusom v roku 2002?","Ktory stat ma v sebe dalsi stat?", "Akou menou sa plati v Rumunsku?","Aka je dlzka Cinskeho muru?","V akom state sidli spolocnost Samsung?","Ktora spolocnost vlastni najvacsi rozsah privatnych IP adries?","Ktory je najrychlejsie rastuci programovaci jazyk?","Ktory jazyk je najpouzivanejsi na svete?", "Kto sa stal majstrom sveta v sachu roku 2016?","Ake pomery ma olympijska vlajka sirka/vyska?", "Ktore z tychto aut nepatri Japnosku?", "Kto vymyslel prvy automobil?", "Aka je najrychlejsia motorka na svete?", "Aka je nadmorska vyska Gerlachovskeho stitu?", "Statna  poznavacia znacka ktoreho okresu je TT?", "Ktora je najvyssie polozena obec na Slovensku?", "Kto vynasiel ziarovku?", "Co je fantomova bolest?","Ktora z tychto latok sa pouziva na vyrobu skla?","Ktore z tychto zvierat zije volne v prirode na slovensku?", "Aku rychlost dokaze dosiahnut gepard?","Ktore z tychto zvierat nevyuziva echolokaciu?", "Kto zalozil spolocnost Pixar?","Ktory z tychto hercov  neziskal oscara?", "V ktorom roku bol natoceny film Titanic?"};
	static String[] odpovedes = {"Matej Toth","Peter Sagan","Martin Klizan","Jaromir Jagr", " Wayne Gretzky","Sydney Crosby", "Miroslav Satan", "Pavol Demitra", "Zigmund Palffy", "Taliansko", "Indonezia", "Kanada", "Kuny", "Levy", "Rumunske franky", "5000km" ,"6700km", "4600km", "Juzna Korea", "Severna Korea", "Japonsko", "Apple", "AT&T", "US Post Office", "Swift","Python","JavaScript", "Anglictina", "Spanielcina","Mandarinska Cinstina", "Magnus Carlsen", "Vishwanathan Anand", "Sergey Karjakin", "16:9","16:10","3:2","Mitsubishi","Nissan","Kia","Henry Ford","Carl Benz", "Ettore Bugatti","Kawasaki Ninja H2", "Suzuki Hayabusa", "Ducati 1199 Panigale R", "2655","2665","2565","Trencin","Trnava","Trebisov","Strbske Pleso","Uloza","Oravska Lesna","Edison","Einstein","Tesla","Pocit bolesti v amputovanej koncatine","Bolest koncatin pri radosti","Bolest sposobena neexistujucimi vecami", "Chrom", "Kremik","Vapnik","Krokodil","Albatros","Zubor","110","125","100","Velryba","Netopier","Sova","Michael Wright","Bill Gates", "Steve Jobs","Will Smith","Leonardo di Caprio","Bradley Cooper","1997","2000","2003"};
	static int[] spravnee = {0,1,2,0,1,1,0,1,0,2,0,2,2,1,0,0,1,0,0,0,1,2,0,2,2,0,0};
	static ArrayList<Integer> spravne = new ArrayList<Integer>();
	static ArrayList<String> themes = new ArrayList<String>(Arrays.asList(themes_1));
	static ArrayList<String> otazocky = new ArrayList<String>(Arrays.asList(otazockas));
	static ArrayList<String> odpovede = new ArrayList<String>(Arrays.asList(odpovedes));
	static ArrayList<tema> temy = new ArrayList<tema>();
	
	
	
	public questions(){
		for(int i = 0; i<9; i++)
			temy.add(new tema());	
	}
	public void printout () {
		for(int i=0; i<themes.size();i++)
			System.out.println((i+1) + "." + themes.get(i));
		System.out.print("Vyberte si temu: ");
	}
	static void ask(int current_question, int difficulty){
		temy.get(current_question).call(current_question,difficulty);
	}
	static void removal(int zmazat) {
		temy.remove(zmazat);
		themes.remove(zmazat);
		for(int i =0;i<3;i++)
			otazocky.remove(zmazat*3);
		for(int i=0;i<3;i++)
			if(zmazat==0)
				odpovede.remove(0);
			else 
				odpovede.remove((zmazat*9));	
		for(int i=0;i<3;i++) {
			spravne.remove(zmazat*3);
		}
			
			
	}	
}
