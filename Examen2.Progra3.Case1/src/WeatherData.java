
public class WeatherData implements Observer{
    
/*
 * Para permitir como lo indica el enunciado que en un futuro la empresa
 * Weather-ORama pueda modificar sus propias pantallas meteorol�gicas aplicamos
 * tambi�n el patr�n Decorador a las clases observadoras, por lo tanto, comenzamos 
 * con una clase base que implemente las funcionalidades b�sicas que debe tener un
 * observador y as� luego sacar provecho de la decoraci�n para generar m�s dispositivos.
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
