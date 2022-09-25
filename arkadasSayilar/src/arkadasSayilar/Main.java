package arkadasSayilar;

public class Main {

	public static void main(String[] args) {

		int sayi1 = 220;
		int sayi2 = 284;
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				total1 += i;
			}
			if (sayi2 % i == 0) {
				total2 += i;
			}

		}
		if (total1 == sayi2 && total2 == sayi1) {
			System.out.println("Arkadaş sayılar.");
		} else {
			System.out.println("Arkadaş sayı değildirler.");
		}

		System.out.println("Birinci toplam : " + total1 + " İkinci Toplam : " + total2);

	}

}
