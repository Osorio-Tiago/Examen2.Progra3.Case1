
public interface Observer{
	
/*La interfaz observer instancia cuáles serán los métodos utilizados por las 
 * clases que estarán observando a DataManager que a su vez usa la interfaz 
 * subject. El método update actualizara los atributos que deseamos a las clases
 * observadoras
 */	
	
    void createFunctionality();
    
    void update(double temperature, double humidity, double barometricPressure);
    
}
