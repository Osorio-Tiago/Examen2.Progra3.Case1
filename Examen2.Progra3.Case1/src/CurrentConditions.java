
public class CurrentConditions extends WeatherDataDecorator{
    
    
    double temperature;
    double humidity;
    double barometricPressure;
    
    //Metodos
    
    public CurrentConditions(Observer data) {
        super(data);
    }
    
    @Override
    public void createFunctionality() {
        super.createFunctionality();
        System.out.println("+=====+==================================+");
        System.out.println("|Condiciones Actuales:                   |");
        System.out.println("+=====+==================================+");
        System.out.println("[1]-Temperatura: " + temperature + "°C");
        System.out.println("[2]-Humedad: " + humidity + " H");
        System.out.println("[3]-Presión Barométrica: " + barometricPressure);
        System.out.println("+=====+==================================+ \n \n");
    }

    @Override
    public void update(double temperature, double humidity, double barometricPressure) {
        super.update(temperature, humidity, barometricPressure);
        this.temperature = temperature;
        this.humidity = humidity;
        this.barometricPressure = barometricPressure;     
    }
    
    
}
