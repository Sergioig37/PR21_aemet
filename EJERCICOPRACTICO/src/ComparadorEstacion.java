import java.util.Comparator;

public class ComparadorEstacion implements Comparator <Dia> {
	
	
	private int formaDeComparar;
	private int ordenDeComparacion;
	public static final int POR_TEMPERATURA = 1;
	public static final int POR_HUMEDAD = 2;
	public static final int ASCENDENTE = 1;
	public static final int DESCENDENTE = 2;
	
	
	public ComparadorEstacion(int formaDeComparar) {
		
		this.formaDeComparar = formaDeComparar;
		
		
		
		ordenDeComparacion = ASCENDENTE;
		//
	}
	
	public void cambiarFormaDeComparar(int formaComparar) {
		
		this.formaDeComparar = formaComparar;
		
	}
	public void cambiarOrdenDeComparacion(int ordenComparacion) {
		
		this.ordenDeComparacion = ordenComparacion;
	}
	
	@Override
	public int compare(Dia d1, Dia d2) {
		
		int devolver = 0 ;
		
		switch(formaDeComparar) {
		case(POR_HUMEDAD):
				if(ordenDeComparacion == ASCENDENTE) {
					devolver = d1.getHumedad()-d2.getHumedad();
				}
				else {
					devolver = d2.getHumedad()-d1.getHumedad();
				}
		break;
		case(POR_TEMPERATURA):
			if(ordenDeComparacion == ASCENDENTE) {
				devolver = d1.getTemperatura()-d2.getTemperatura();
			}
			else {
				devolver = d2.getTemperatura()-d1.getTemperatura();
			}
		}
		
		
		return devolver;
	}

}
