package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String ogrenci1 = "Cemal";
		String ogrenci2 = "Okan";
		String ogrenci3 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("*****************");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Cemal";
		ogrenciler[1] = "Okan" ;
		ogrenciler[2] = "Ahmet";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("İkinci kullanım : ");
		for(String ogrenci: ogrenciler) {
			
			System.out.println(ogrenci);
		}
	}

}
