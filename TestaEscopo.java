
public class TestaEscopo {

	public static void main(String[] args) {
		int idade = 20;
		int quantidadeDePessoas = 3;
		boolean acompanhado;
		
		
		if(quantidadeDePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println(acompanhado);
	}
}
