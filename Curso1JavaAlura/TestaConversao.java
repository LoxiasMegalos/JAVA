
public class TestaConversao {
	
	public static void main(String[] args) {
		//double salario = 1270.50;
		//int valor = salario;
		
		double valor = 3;
		
		double decimal = 1220.35;
		int valor_decimal = (int) decimal;
		System.out.println(valor_decimal);
		
		
		long numeroGrande = 1111111111111111111l;
	
		double valorUm = 0.2;
		double valorDois = 0.1;
		double valorTotal = valorUm + valorDois;
		
		System.out.println(valorTotal);
		System.out.printf("%.1f%n", valorTotal);
		
		float pi = 3.14f;
		
	}
}
