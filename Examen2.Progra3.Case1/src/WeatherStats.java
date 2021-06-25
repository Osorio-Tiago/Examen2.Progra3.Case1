import java.util.ArrayList;
import java.util.List;


public class WeatherStats extends WeatherDataDecorator{
	
/*
 * La clase WeatherStats es una clase observadora en la cual tomaremos
 * la data observada y procedemos a aplicar cálculos debido a su estado mediante
 * diferentes métodos.
 */
	

    
    private final List<Double> temperatureInformation = new ArrayList<Double>();
    private final List<Double> humidityInformation = new ArrayList<Double>();
    private final List<Double> barometricInformation = new ArrayList<Double>();

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
        averageValue(temperatureInformation);
        maximumValue(temperatureInformation);
        minimumValue(temperatureInformation);
        System.out.println("|________________________________________");
        
        System.out.println("|[2]- Humedad                            ");
        averageValue(humidityInformation);
        maximumValue(humidityInformation);
        minimumValue(humidityInformation);
        System.out.println("|________________________________________");
        
        System.out.println("|[3]- Presion Barometrica                ");
        averageValue(barometricInformation);
        maximumValue(barometricInformation);
        minimumValue(barometricInformation);
        System.out.println("|________________________________________ \n");
    }

    @Override
    public void update(double temperature, double humidity, double barometricPressure) {
        super.update(temperature, humidity, barometricPressure);
        temperatureInformation.add(temperature);
        humidityInformation.add(humidity);
        barometricInformation.add(barometricPressure);
    }
    
    /*
     * Utilizacion de expresiones lambda para calcular
     * 
     * Maximo - Minimo - Promedio
     */
    
    public void maximumValue(List<Double> record){
    	System.out.println("Máximo: " + record.stream().mapToDouble(i -> i).max().getAsDouble());
    }
    
    public void minimumValue(List<Double> record){
        System.out.println("Mínimo: " + record.stream().mapToDouble(i -> i).min().getAsDouble());
    }
    
    public void averageValue(List<Double> record){  
    	System.out.println("Promedio: " + record.stream().mapToDouble(i -> i).average().getAsDouble());
    }
}
