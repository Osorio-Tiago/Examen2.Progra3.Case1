
public class WeatherDataDecorator implements Observer{

/*
 * La clase decorador al igual que la clase base WeatherData implementa los 
 * metodos para poder hacer las modificaciones deseadas a las futuras clases 
 * observadoras.
 * 
 */    
    private final Observer data;   
    
    //Metodos

    public WeatherDataDecorator(Observer data) {
        this.data = data;
    }
    
    @Override
    public void createFunctionality() {
        this.data.createFunctionality();
    }   

    @Override
    public void update(double temperature, double humidity, double barometricPressure) {
        this.data.update(temperature, humidity, barometricPressure);
    }
}