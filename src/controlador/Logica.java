package controlador;

import utils.Ayudante;
import utils.Resta;
import utils.Suma;

public class Logica {
	
	public double calcular(String valores){
		
		String[]numeros;
		double resultado= 0;
		
		if (valores.contains( "+" )) {
		 
			numeros= valores.split( "\\+" );
			
			if (numeros.length > 1) {
				Suma sumar = new Suma();
				
				switch (numeros.length) {
				case 2:
					resultado = sumar.Suma("+",Ayudante.conversor(numeros[0]),Ayudante.conversor(numeros[1]));
					break;
				case 3:
					resultado = sumar.Suma("+",Ayudante.conversor(numeros[0]),Ayudante.conversor(numeros[1]),Ayudante.conversor(numeros[2]));
					break;
				default:
					resultado =sumar.Suma("+",Ayudante.conversor(numeros));
					break;
				}
			}
		}

		
		if(valores.contains("-")){
			numeros= valores.split( "-" );
			
			if (numeros.length > 1) {
				Resta restar = new Resta();
				
				switch (numeros.length) {
				case 2:
					resultado = restar.Resta("-",Ayudante.conversor(numeros[0]),Ayudante.conversor(numeros[1]));
					break;
				case 3:
					resultado = restar.Resta("-",Ayudante.conversor(numeros[0]),Ayudante.conversor(numeros[1]),Ayudante.conversor(numeros[2]));
					break;
				default:
					resultado = restar.Resta("-",Ayudante.conversor(numeros));
					break;
				}
			}
			
		}
		return resultado;
	}

}
