
public class Dia {
	
	private int temperatura;
	private int humedad;
	private int numeroDia;
	
	public Dia(int numeroDia) {
		
		this.numeroDia = numeroDia;
		
		temperatura = (int)(Math.random()*50+1-10);
		
		humedad = (int)(Math.random()*100+1);
		
	}
	
	
	public int getTemperatura() {
		return temperatura;
	}
	public int getHumedad() {
		return humedad;
	}
	
	public int getNumeroDia() {
		return numeroDia;
	}


	@Override
	public String toString() {
		return "[Dia número : " + numeroDia 
				+" Temperatura = "+ temperatura
				+" Humedad = " +humedad +"% ]";
	}

	
	
}
