package ders2_odev2;


public class SayiBulma {

	public static void main(String[] args) {
	int[] sayilar =new int[] {1,2,3,4,5,6,7,99};
	int aranacakSayi = 100;
	boolean varMi = false;

	for (int sayi : sayilar) {
		if (aranacakSayi==sayi){
			varMi = true;
			break ;} // true ise döngüden çık
	}
		if(varMi == true) {
	System.out.println("aranacak sayı" + aranacakSayi);
	}
		else 
			System.out.println("aranacak sayı bulunamadı" );
	}
}