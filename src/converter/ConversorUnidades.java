package converter;

public class ConversorUnidades {

		//Método de conversão celsius para fahrenheit
		public static double celsiusParaFahrenheit(double celsius) {
			
			double resultado = celsius * 1.8 + 32;
			return resultado;
        }
		
		//Método de conversão quilometros para milhas
		public static double quilometrosParaMilhas(double quilometros) {
			
			quilometros = 685;
			double resultado = quilometros * 0.621371;
			return resultado;
		}
		
		//Método de conversão gramas para libras
		public static double gramasParaLibras(double gramas) {
			
			gramas = 4.667;
			double resultado = gramas * 0.00220462;
			return resultado;
		}

		
		public class main{
			
			//Valores aplicados
			public static void main (String [] args) {
				double celsius = 37;
				double quilometros = 685;
				double gramas = 4.667;
				 
				//Chamando os métodos da classe 
				double conversao = ConversorUnidades.celsiusParaFahrenheit(celsius);
				System.out.println("A conversão de 37 celsius para fahrenheit deu:" + conversao);
				
				double conversao2 = ConversorUnidades.quilometrosParaMilhas(quilometros);
				System.out.println("A conversão de 685 quilometros para milhas deu:" + conversao2);
				
				double conversao3 = ConversorUnidades.gramasParaLibras(gramas);
				System.out.println("A conversão de 4.667 gramas para libras deu:" + conversao3);
			}
		}
		
		
}
