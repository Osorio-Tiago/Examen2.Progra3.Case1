import java.util.ArrayList;
import java.util.List;


public class WeatherStats extends WeatherDataDecorator{
    
    //Atributos
    
    private final List<Double> temperatureRecord = new ArrayList<Double>();
    private final List<Double> humidityRecord = new ArrayList<Double>();
    private final List<Double> barometricRecord = new ArrayList<Double>();
    
    //Metodos
    
    public WeatherStats(Observer data) {
        super(data);
    }
    
    @Override
    public void createFunctionality() {
        super.createFunctionality();
        System.out.println("+===================+");
        System.out.println("WeatherStats: ");
        System.out.println("Estadisticas: ");
        
        System.out.println("Temperatura ");
        average(temperatureRecord);
        max(temperatureRecord);
        min(temperatureRecord);
        
        System.out.println("Humedad ");
        average(humidityRecord);
        max(humidityRecord);
        min(humidityRecord);
        
        System.out.println("Presion Barometrica ");
        average(barometricRecord);
        max(barometricRecord);
        min(barometricRecord);
    }

    @Override
    public void update(double temperature, double humidity, double barometricPressure) {
        super.update(temperature, humidity, barometricPressure);
        temperatureRecord.add(temperature);
        humidityRecord.add(humidity);
        barometricRecord.add(barometricPressure);
    }
    
    /*
     * Utilizacion de expresiones lambda para calcular
     * 
     * Maximo - Minimo - Promedio
     */
    
    public void max(List<Double> record){
    	System.out.println("Máximo: " + record.stream().mapToDouble(i -> i).max().getAsDouble());
    }
    
    public void min(List<Double> record){
        System.out.println("Mínimo: " + record.stream().mapToDouble(i -> i).min().getAsDouble());
    }
    
    public void average(List<Double> record){  
    	System.out.println("Promedio: " + record.stream().mapToDouble(i -> i).average().getAsDouble());
    }
}
