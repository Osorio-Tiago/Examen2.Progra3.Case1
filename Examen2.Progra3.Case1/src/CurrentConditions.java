
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
        System.out.println("----------------------------------------------------");
        System.out.println("Con las funcionalidades de CurrentCondition: ");
        this.condicionesActuales();
    }

    @Override
    public void update(double temperature, double humidity, double barometricPressure) {
        super.update(temperature, humidity, barometricPressure);
        this.temperature = temperature;
        this.humidity = humidity;
        this.barometricPressure = barometricPressure;     
    }
    
    public void condicionesActuales(){
        System.out.println("Condiciones actuales: ");
        System.out.println("Temperatura: " + temperature);
        System.out.println("Humedad: " + humidity);
        System.out.println("Presion Barometrica: " + barometricPressure);
    }
}
