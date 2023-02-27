
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstacionMetereologica aemet = new EstacionMetereologica(30);
		System.out.println(aemet);
		
		// ordena los datos por el critri de la temperatura e imprimir
		aemet.ordenarTemperatura();
		System.out.println(aemet);
		
		//  ordena los datos por el criterio de la humedad e imprimir
		aemet.ordenarHumedad();
		System.out.println(aemet);
	}

}
