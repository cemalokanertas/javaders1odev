package mukemmelSayi;

public class Main {
	public static void main(String[] args) {
		int sayi = 10;
		int total = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				total += i;
			}
		}

		System.out.println(total);
		if (total == sayi) {
			System.out.println("Mükemmel Sayı");
		} else {
			System.out.println("Mükemmel sayı değil!");
		}
	}

}
