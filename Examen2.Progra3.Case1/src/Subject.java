
public interface Subject {

	//Subject es una interfaz que instancia los métodos que luego 
	//serán utilizados por la clase que será observada
	
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyUpdate(double temperature, double humidity, double barometricPressure);
    
}
