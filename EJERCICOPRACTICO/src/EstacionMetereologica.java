import java.util.Arrays;

public class EstacionMetereologica {
	
	private int diasMes;
	private Dia dia;
	private Dia[] dias;
	
	public EstacionMetereologica(int diasmes) {
		
		this.diasMes = diasmes;
		
		 dias = new Dia[diasMes];
		
		for(int i = 1; i<=diasmes;i++) {
			dia = new Dia(i);
			dias[i-1] = dia;
			
		}
		
	}
	
	
	public void ordenarTemperatura() {
		

		ComparadorEstacion humedad = new ComparadorEstacion(ComparadorEstacion.POR_TEMPERATURA);
		Arrays.sort(dias, humedad);
		
	}
	
	public void ordenarHumedad() {
		

		ComparadorEstacion humedad = new ComparadorEstacion(ComparadorEstacion.POR_HUMEDAD);
		Arrays.sort(dias, humedad);
		
	}
	
	public int getDiasMes() {
		
		return diasMes;
	}

	@Override
	public String toString() {
		
		String mejora = "[ Este mes tiene " + diasMes +" Días"  ;
		
		mejora += Arrays.toString(dias);
		
		mejora +="]";
		return mejora;
	}
	
	
	
}
