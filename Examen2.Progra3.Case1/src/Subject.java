
public interface Subject {
	
    public void attach(WeatherData observer);
    public void detach(WeatherData observer);
    public void notifyUpdate(double temperature, double humidity, double barometricPressure);
    
}
