
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Observer dispositivo1 = new Forecast(new WeatherStats(new CurrentConditions(new WeatherData())));
	        
	        Observer dispositivoHibrido1 = new Forecast(new CurrentConditions(new WeatherData()));
	        Observer dispositivoHibrido2 = new Forecast(new WeatherStats(new WeatherData()));
	        
	        
	        DataManager dataManager = new DataManager();
	        dataManager.attach(dispositivo1);
	        
	        System.out.println("               +======================+");
	        System.out.println("               |      Primer set      |");
	        System.out.println("               +======================+");
	        System.out.println("\n");
	        
	        dataManager.notifyUpdate(32.30, 33.0, 30);
	        dataManager.notifyUpdate(10, 17.20, 20);
	        dataManager.notifyUpdate(9.95, 5.02, 10);
	        
	        
	        
	        dispositivo1.createFunctionality();
	        
	        System.out.println("               +======================+");
	        System.out.println("               |     Segundo set      |");
	        System.out.println("               +======================+");
	        System.out.println("\n");
	        
	        dataManager.attach(dispositivoHibrido1);
	        dataManager.attach(dispositivoHibrido2);
	        
	        dataManager.notifyUpdate(52.40, 53.0, 10);
	        dataManager.notifyUpdate(30, 57.20, 20);
	        dataManager.notifyUpdate(7.95, 7.02, 60);
	        
	        dispositivo1.createFunctionality();
	        System.out.println("----------------------------------------------------");
	        dispositivoHibrido1.createFunctionality();
	        System.out.println("----------------------------------------------------");
	        dispositivoHibrido2.createFunctionality();
	    
	}
}
