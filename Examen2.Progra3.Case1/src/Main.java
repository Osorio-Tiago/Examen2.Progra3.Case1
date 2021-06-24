
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Observer dispositivoGeneral = new Forecast(new WeatherStats(new CurrentConditions(new WeatherData())));
	        
	        Observer primerHibrido = new Forecast(new CurrentConditions(new WeatherData()));
	        Observer segundoHibrido = new Forecast(new WeatherStats(new WeatherData()));
	        
	        
	        DataManager dataManager = new DataManager();
	        dataManager.attach(dispositivoGeneral);
	        
	        System.out.println("               +======================+");
	        System.out.println("               |      Primer set      |");
	        System.out.println("               +======================+");
	        System.out.println("\n");
	        
	        dataManager.notifyUpdate(32.30, 33.0, 30);
	        dataManager.notifyUpdate(10, 17.20, 20);
	        dataManager.notifyUpdate(9.95, 5.02, 10);
	        
	        
	        
	        dispositivoGeneral.createFunctionality();
	        
	        System.out.println("               +======================+");
	        System.out.println("               |     Segundo set      |");
	        System.out.println("               +======================+");
	        System.out.println("\n");
	        
	        dataManager.attach(primerHibrido);
	        dataManager.attach(segundoHibrido);
	        
	        dataManager.notifyUpdate(52.40, 53.0, 10);
	        dataManager.notifyUpdate(30, 57.20, 20);
	        dataManager.notifyUpdate(7.95, 7.02, 60);
	        
	        System.out.println("*---------------------------------------------");
	        
	        dispositivoGeneral.createFunctionality();
	        System.out.println("*****************************************");
	        System.out.println("|      Primer Dispositivo H�brido       |");
	        System.out.println("*****************************************");
	        primerHibrido.createFunctionality();
	        
	        System.out.println("*---------------------------------------------\n");
	        System.out.println("*****************************************");
	        System.out.println("|Segundo Dispositivo H�brido              |");
	        System.out.println("*****************************************");
	        segundoHibrido.createFunctionality();
	    
	}
}
