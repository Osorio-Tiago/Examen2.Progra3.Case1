import java.util.ArrayList;
import java.util.List;



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


