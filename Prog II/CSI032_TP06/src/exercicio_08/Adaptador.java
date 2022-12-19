package exercicio_08;

public class Adaptador implements MedidorCelsiusIF{
	
	MedidorFarenheit mf = new MedidorFarenheit();
	
	private double firen = mf.getTemperaturaFarenheit();
	
	private double celcius = ((firen - 32)/1.8) ;
	
	@Override
	public double medirTemperatura() {
		return celcius;
	}
	
}
