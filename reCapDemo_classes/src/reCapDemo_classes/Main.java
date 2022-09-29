package reCapDemo_classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		
		int sonuc = dortIslem.Topla(3, 5);
		System.out.println("sonuc :" + sonuc);
		
		int sonuc2 = dortIslem.Carp(3, 5);
		System.out.println("sonuc :" + sonuc2);
		
		int sonuc3 = dortIslem.Cıkart(3, 5);
		System.out.println("sonuc :" + sonuc3);
		
		int sonuc4 = dortIslem.Bol(10, 5);
		System.out.println("sonuc :" + sonuc4);
	}

}
