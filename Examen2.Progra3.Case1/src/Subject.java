
public interface Subject {
	
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyUpdate(double temperature, double humidity, double barometricPressure);
    
}
