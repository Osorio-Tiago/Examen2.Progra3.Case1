
public interface Subject {

	//Subject es una interfaz que instancia los m�todos que luego 
	//ser�n utilizados por la clase que ser� observada
	
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyUpdate(double temperature, double humidity, double barometricPressure);
    
}
