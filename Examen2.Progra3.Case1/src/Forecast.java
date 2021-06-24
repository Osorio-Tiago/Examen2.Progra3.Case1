import java.util.ArrayList;
import java.util.List;

/*
* La clase Forecast es una clase observadora en la cual tomaremos
 * la data observada y procedemos a aplicar c�lculos debido a su estado mediante
 * diferentes m�todos.
 * */

public class Forecast extends WeatherDataDecorator{
    
    
    private final List<Double> estimatedTemperature = new ArrayList();
    private final List<Double> estimatedHumidity = new ArrayList();
    private final List<Double> estBarometricPressure = new ArrayList();
    
    
    public Forecast(Observer data) {
        super(data);
    }
    
  
    @Override
    public void update(double temperature, double humidity, double barometricPressure) {
        super.update(temperature, humidity, barometricPressure);
        estimatedTemperature.add(temperature);
        estimatedHumidity.add(humidity);
        estBarometricPressure.add(barometricPressure);
    }
    
    @Override
    public void createFunctionality() {
        super.createFunctionality();
        System.out.println("\n");
        System.out.println("+=====+==================================+");
        System.out.println("|Informaci�n Forecast:                   |");
        System.out.println("+=====+==================================+");;
        System.out.println("|Temperatura: " + forecast(estimatedTemperature) + "�C ");          
        System.out.println("|Humedad: " + forecast(estimatedHumidity) +" H");      
        System.out.println("|Presion Barometrica:" + forecast(estBarometricPressure));
        System.out.println("+=====+==================================+");;
        System.out.println("\n \n");
    }

 // En este caso el m�todo forecast nos permite sacar un promedio
 // de los reportes obtenidos en cada elementos caracter�sticos a observar. 
 // manipulandolos con una lista.
    
    
    public double forecast(List<Double> record){
        double pronostico = 0;
        
        for(int i = 0; i < record.size(); i++){
            pronostico += record.get(i);
        }
        
        return pronostico/record.size();
    }
}
