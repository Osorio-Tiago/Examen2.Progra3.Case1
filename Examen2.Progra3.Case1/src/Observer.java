
public interface Observer{
	
/*La interfaz observer instancia cu�les ser�n los m�todos utilizados por las 
 * clases que estar�n observando a DataManager que a su vez usa la interfaz 
 * subject. El m�todo update actualizara los atributos que deseamos a las clases
 * observadoras
 */	
	
    void createFunctionality();
    
    void update(double temperature, double humidity, double barometricPressure);
    
}
