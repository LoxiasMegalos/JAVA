
public class TesteIR {
	public static void main(String[] args) {
		
		double salario =2800.0000;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println(" o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		}
		else if(salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("o IR é de 15% e pode deduzir R$ 350");
		}
		else if(salario >= 3751.01 && salario <= 4664.0){
			System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
		}
		
		
		int x = 21;
		
		switch(x) {
			case 1:
				System.out.println("X vale 1");
				break;
			case 2:
				System.out.println("X vale 2");
				break;
			default:
				System.out.println("X invalido!");
				break;
		}
	}
}
