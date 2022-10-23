
public class Main {

	public static void main(String[] args) {
		
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		
		KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
		kidsGameCalculator.hesapla();
		

		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.hesapla();

	}

}
