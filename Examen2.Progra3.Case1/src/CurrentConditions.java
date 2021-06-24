
public class CurrentConditions extends WeatherDataDecorator {

/*
 * La clase CurrentConditions es una clase observadora en la cual tomaremos la
 * data observada en tiempo real y mandaremos a montrar mediante la ventana
 * metereológica, así no solo informará del estado actual sino que permitirá
 * generar nuevos dipositivos con la información brindada.
 */

	double temperature;
	double humidity;
	double barometricPressure;

	// Metodos

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
