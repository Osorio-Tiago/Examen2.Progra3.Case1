
public class WeatherDataDecorator implements Observer{

    
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