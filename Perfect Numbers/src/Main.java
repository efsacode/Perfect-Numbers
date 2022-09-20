
public class Main {

	public static void main(String[] args) {
		int sayi = 144;
		int toplam = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;
			}
		}
		if (toplam == sayi) {
			System.out.println("Your number is a perfect number");
		} else {
			System.out.println("Your number is not a perfect number");
		}
	}
}
