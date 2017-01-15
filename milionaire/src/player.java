
public class player {
	
	public int konto;
	public int[] prize = {1000,2000,5000,10000,50000,100000,250000,500000,1000000};
	public player() {
		
	}
	public void addition(int hodnota) {
		konto = prize[hodnota];
	}
}
