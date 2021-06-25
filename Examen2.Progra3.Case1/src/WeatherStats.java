import java.util.ArrayList;
import java.util.List;


public class WeatherStats extends WeatherDataDecorator{
	
/*
 * La clase WeatherStats es una clase observadora en la cual tomaremos
 * la data observada y procedemos a aplicar cálculos debido a su estado mediante
 * diferentes métodos.
 */
	

    
    private final List<Double> temperatureInformation = new ArrayList();
    private final List<Double> humidityInformation = new ArrayList();
    private final List<Double> barometricInformation = new ArrayList();
    

    
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
     * El método average nos permite recorrer la lista de reportes compuesta por la 
     * data observada y así sacar un promedio general de los valores que 
     * la componen en cada elemento característico.
     * 
     */     
        public void averageValue(List<Double> value){
            double promedio = 0;
            
            for(int i = 0; i < value.size(); i++){
                promedio += value.get(i);
            }
            
            System.out.println("|Promedio: " + promedio/value.size());
        }
  
	/*
	 * El método mínimo nos permite recorrer la lista de reportes compuesta por la
	 * data observada y así sacar los valores más bajos que la componen en cada
	 * característica.
	 * 
	 */
	public void minimumValue(List<Double> value) {
		double minimum = 0;

		for (int i = 0; i < value.size(); i++) {
			if (minimum == 0)
				minimum = value.get(i);

			if (minimum > value.get(i))
				minimum = value.get(i);
		}

		System.out.println("|Minimo: " + minimum);
	}
/*
 * El método máximo nos permite recorrer la lista de reportes compuesta por la 
 * data observada y así sacar los valores más altos que la componen en cada
 * característica.
 * 
 */    
    public void maximumValue(List<Double> value){
        double maximum = 0;
        
        for(int i = 0; i < value.size(); i++){
            if(maximum==0)
                maximum = value.get(i);
                
            if(maximum<value.get(i))
                maximum = value.get(i);            
        }
        
        System.out.println("|Maximo: " + maximum);
    }


    
}
