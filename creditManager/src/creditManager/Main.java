package creditManager;

public class Main {

	public static void main(String[] args) {
		
		CreditManager creditmanager = new CreditManager();
			creditmanager.calculate();
			creditmanager.add();
		MortgageManager morgagemanager = new MortgageManager();
			morgagemanager.calculate();
		VehicleManager	vehiclemanager = new VehicleManager();
			vehiclemanager.calculate();
		CreditManager[] credits = new CreditManager[2];
			credits[0] = new MortgageManager(); // artık credits[0] new lediğimiz için morgage tutuyor.
			credits[1] = new VehicleManager(); // creditManger 2 elemanı var. morgage ve vehicle
		for (int i = 0; i < credits.length; i++) {
			credits[i].calculate(); // 0. elemandan başlayıp tüm elemanlar için calculate fonk çalıştırdı.
		}
}
	
}