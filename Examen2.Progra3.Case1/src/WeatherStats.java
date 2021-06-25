import java.util.ArrayList;
import java.util.List;


public class WeatherStats extends WeatherDataDecorator{
	
/*
 * La clase WeatherStats es una clase observadora en la cual tomaremos
 * la data observada y procedemos a aplicar cálculos debido a su estado mediante
 * diferentes métodos.
 */
	

    
    private final List<Double> temperatureRecord = new ArrayList();
    private final List<Double> humidityRecord = new ArrayList();
    private final List<Double> barometricRecord = new ArrayList();
    

    
    public WeatherStats(Observer data) {
        super(data);
    }
    
    @Override
    public void createFunctionality() {
        super.createFunctionality();
        System.out.println("+=====+==================================+");
        System.out.println("|Estadísticas Meteorológicas             |");
        System.out.println("+=====+==================================+");    
        System.out.println("|[1]- Información Temperatura:           ");
        averageValue(temperatureRecord);
        maximumValue(temperatureRecord);
        minimumValue(temperatureRecord);
        System.out.println("|________________________________________");
        
        System.out.println("|[2]- Humedad                            ");
        averageValue(humidityRecord);
        maximumValue(humidityRecord);
        minimumValue(humidityRecord);
        System.out.println("|________________________________________");
        
        System.out.println("|[3]- Presion Barometrica                ");
        averageValue(barometricRecord);
        maximumValue(barometricRecord);
        minimumValue(barometricRecord);
        System.out.println("|________________________________________ \n");
    }

    @Override
    public void update(double temperature, double humidity, double barometricPressure) {
        super.update(temperature, humidity, barometricPressure);
        temperatureRecord.add(temperature);
        humidityRecord.add(humidity);
        barometricRecord.add(barometricPressure);
    }
  
/*
 * El método máximo nos permite recorrer la lista de reportes compuesta por la 
 * data observada y así sacar los valores más altos que la componen en cada
 * característica.
 * 
 */    
    public void maximumValue(List<Double> record){
        double max = 0;
        
        for(int i = 0; i < record.size(); i++){
            if(max==0)
                max = record.get(i);
                
            if(max<record.get(i))
                max = record.get(i);            
        }
        
        System.out.println("|Maximo: " + max);
    }
/*
 * El método mínimo nos permite recorrer la lista de reportes compuesta por la 
 * data observada y así sacar los valores más bajos que la componen en cada
 * característica.
 * 
 */     
    public void minimumValue(List<Double> record){
        double min = 0;

        for(int i = 0; i < record.size(); i++){
            if(min==0)
                min = record.get(i);
                
            if(min>record.get(i))
                min = record.get(i);            
        }
        
        System.out.println("|Minimo: " + min);
    }
/*
 * El método average nos permite recorrer la lista de reportes compuesta por la 
 * data observada y así sacar un promedio general de los valores que 
 * la componen en cada elemento característico.
 * 
 */     
    public void averageValue(List<Double> record){
        double promedio = 0;
        
        for(int i = 0; i < record.size(); i++){
            promedio += record.get(i);
        }
        
        System.out.println("|Promedio: " + promedio/record.size());
    }
}
