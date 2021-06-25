/*
 * Examen II - Justificación de los patrones seleccionados - Caso I:
 * 
 * Para el primer set partiendo de las necesidades mencionadas en el enunciado respecto a crear 3
 * elementos de visualización los cuales dependen de una actualización constante en dipositivo principal
 * tomamos la decisión de utilizar el patron "Observer" ya que nos da gran facilidad a la hora de querer 
 * actualizas los elementos de visualización de una manera eficiente por medio de un Subject y Observers.  
 * 
 * Para el segundo set respecto a las necesidades de crear dispositivos hibridos los cuales combinan 
 * 2 o más elementos de visualización tomamos la decisión de utilizar el patron Decorador el cual nos ayuda 
 * tanto  en el primer set a crear un solo "dispositivoGeneral" demostrando los 3 elemento de 
 * visualización sino que tambien nos ayuda a crear dipositivos hibridos con diferentes combinaciones, 
 * eso ayudará a Weather-ORama a tomar solo las combinaciones deseadas para sus futuras API. 
 * 
 * 
 * */




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
	        
	        dataManager.notifyUpdate(28, 25.5, 20);
	        dataManager.notifyUpdate(15, 18, 20);
	        dataManager.notifyUpdate(30, 15.5, 22.20);
	        
	        
	        
	        dispositivoGeneral.createFunctionality();
	        
	        System.out.println("               +======================+");
	        System.out.println("               |     Segundo set      |");
	        System.out.println("               +======================+");
	        System.out.println("\n");
	        
	        dataManager.attach(primerHibrido);
	        dataManager.attach(segundoHibrido);
	        
	        dataManager.notifyUpdate(42.50, 33.0, 30);
	        dataManager.notifyUpdate(17, 43.60, 25);
	        dataManager.notifyUpdate(24, 12.15, 40);
	        
	        System.out.println("*---------------------------------------------");
	        
	        dispositivoGeneral.createFunctionality();
	        System.out.println("*****************************************");
	        System.out.println("|      Primer Dispositivo Híbrido       |");
	        System.out.println("*****************************************");
	        primerHibrido.createFunctionality();
	        
	        System.out.println("*---------------------------------------------\n");
	        System.out.println("*****************************************");
	        System.out.println("|     Segundo Dispositivo Híbrido       |");
	        System.out.println("*****************************************");
	        segundoHibrido.createFunctionality();
	    
	}
}
