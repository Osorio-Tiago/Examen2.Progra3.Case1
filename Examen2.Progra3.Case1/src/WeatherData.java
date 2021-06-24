
public class WeatherData implements Observer{
    
/*
 * Para permitir como lo indica el enunciado que en un futuro la empresa
 * Weather-ORama pueda modificar sus propias pantallas meteorológicas aplicamos
 * también el patrón Decorador a las clases observadoras, por lo tanto, comenzamos 
 * con una clase base que implemente las funcionalidades básicas que debe tener un
 * observador y así luego sacar provecho de la decoración para generar más dispositivos.
 *
 */  
    @Override
    public void createFunctionality() {
    	System.out.println("\n");
    	System.out.println("+=====+==================================+");
        System.out.println("|Dispositivo WeatherData                 |");
    }

    @Override
    public void update(double temperature, double humidity, double barometricPressure) {
        
    }
    
}
