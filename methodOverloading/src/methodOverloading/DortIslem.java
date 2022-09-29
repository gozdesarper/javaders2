package methodOverloading;

public class DortIslem {
	public int topla(int sayi1 ,int sayi2) {
		return sayi1 + sayi2;
	}
	public int topla(int sayi1 ,int sayi2,int sayi3) { // girilen değişkenleri farklı olduğu için ikiside topla ifadesini alabilir.
		return sayi1 + sayi2 +sayi3;
	}
}
