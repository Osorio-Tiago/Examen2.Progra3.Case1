import java.util.ArrayList;
import java.util.List;


public class WeatherStats extends WeatherDataDecorator{
    
    //Atributos
    
    private final List<Double> temperatureRecord = new ArrayList();
    private final List<Double> humidityRecord = new ArrayList();
    private final List<Double> barometricRecord = new ArrayList();
    
    //Metodos
    
    public WeatherStats(Observer data) {
        super(data);
    }
    
    @Override
    public void createFunctionality() {
        super.createFunctionality();
        System.out.println("----------------------------------------------------");
        System.out.println("Con las funcionalidades de WeatherStats: ");
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
    
    public void max(List<Double> record){
        double max = 0;
        
        for(int i = 0; i < record.size(); i++){
            if(max==0)
                max = record.get(i);
                
            if(max<record.get(i))
                max = record.get(i);            
        }
        
        System.out.println("Maximo: " + max);
    }
    
    public void min(List<Double> record){
        double min = 0;

        for(int i = 0; i < record.size(); i++){
            if(min==0)
                min = record.get(i);
                
            if(min>record.get(i))
                min = record.get(i);            
        }
        
        System.out.println("Minimo: " + min);
    }
    
    public void average(List<Double> record){
        double promedio = 0;
        
        for(int i = 0; i < record.size(); i++){
            promedio += record.get(i);
        }
        
        System.out.println("Promedio: " + promedio/record.size());
    }
}
