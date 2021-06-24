import java.util.ArrayList;
import java.util.List;

/*La clase DataManager implementa la inteface subject y le da funcionalidad
 * a los métodos previamente definidos en la interfaz con los cuales permite 
 * agregar, eliminar futuras clases observadoras de esta y el método notify que
 * nos permite alertar a las clases observadores si hay alguna modificación.
 * */

public class DataManager implements Subject {
    
    
    private final List<Observer> observers = new ArrayList();

    
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(double temperature, double humidity, double barometricPressure) {
    	
    	System.out.println("+==========Condiciones climáticas============+ \n");
        System.out.println("[1]- Temperatura: " + temperature + "°C");
        System.out.println("[2]- Humedad: " + humidity + " H");
        System.out.println("[3]- Presion barometrica: " + barometricPressure);
        System.out.println("\n");
        observers.forEach((o) -> {
            o.update(temperature, humidity, barometricPressure);
        });
    }
}


