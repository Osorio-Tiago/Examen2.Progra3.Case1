import java.util.ArrayList;
import java.util.List;


public class Forecast extends WeatherDataDecorator{
    
    //Atributos
    
    private final List<Double> temperatureRecord = new ArrayList();
    private final List<Double> humidityRecord = new ArrayList();
    private final List<Double> barometricRecord = new ArrayList();
    
    //Metodos
    
    public Forecast(Observer data) {
        super(data);
    }
    
    @Override
    public void createFunctionality() {
        super.createFunctionality();
        System.out.println("\n");
        System.out.println("+=====+==========================+==========================+");
        System.out.println("Forecast: ");
        System.out.println("Pronostico: ");
        
        System.out.println("Temperatura: " + forecast(temperatureRecord));       
        
        System.out.println("Humedad: " + forecast(humidityRecord));      
     
        System.out.println("Presion Barometrica: " + forecast(barometricRecord));
        System.out.println("\n");
    }

    @Override
    public void update(double temperature, double humidity, double barometricPressure) {
        super.update(temperature, humidity, barometricPressure);
        temperatureRecord.add(temperature);
        humidityRecord.add(humidity);
        barometricRecord.add(barometricPressure);
    }
    
    public double forecast(List<Double> record){
        double pronostico = 0;
        
        for(int i = 0; i < record.size(); i++){
            pronostico += record.get(i);
        }
        
        return pronostico/record.size();
    }
}
