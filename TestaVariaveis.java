import java.util.Scanner;


public class TestaVariaveis {
	
	public static void main(String[] args) {
		System.out.println("ola novo teste");
		
		int idade = 21;
		
		System.out.println("Minha idade eh: "+idade);
		
		Scanner entrada = new Scanner(System.in);
		
		int idade_outro;
		
		System.out.print("Qual a sua idade? ");
		idade_outro = entrada.nextInt();
		
		if(idade_outro < 10)
			System.out.println("Que pequeno!");
		
		System.out.println("A idade do outro eh: "+ idade_outro);
		
		int aniversario = 0;
		for(int i = idade_outro; i<10; i++) {
			aniversario++;
			idade_outro = i;
		}
		
		if(idade_outro <= 10)
			System.out.println("Ainda faltam "+aniversario+" aniversarios para completar "+ (idade_outro+1) +" anos");
		
		System.out.print("oi");
		System.out.print("oi");
		System.out.print("oi\n");
		System.out.print("oi");
		
	}
}
