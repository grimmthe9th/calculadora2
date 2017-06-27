import controlador.Logica;
import vista.Pantalla;

public class Aplication {
		public static void main(String[] args) {
			
			Pantalla vista = new Pantalla();
			Logica controlador = new Logica();
			
			String valorIngresado = vista.ingresarValor("Calculadora" );
			
			vista.mostrarMensaje("El resultado es "+ controlador.calcular(valorIngresado));
		}
}
