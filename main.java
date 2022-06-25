package murillo.projeto;

import java.util.Scanner;

public class main {

    public static void main (String [] args){
        int a = 5;
        int b =5;
        int c = a + b;

        System.out.println("Valor de a: "+a+" Valor de b: "+b+" Valor da soma: "+c);

        int d = multiplica(a,b);
        System.out.println("D = "+ d);

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor de H: ");
        int h = teclado.nextInt();
        System.out.println("O valor digitado foi: "+h);

        Teste teste = new Teste("Murillo");
        System.out.println("nome = "+ teste.getNome());

        Carro ferrari = new Carro(10, 200);
        System.out.println("A velocidade da ferrari sem acelerar eh: "+ ferrari.getVelocidade());

        int x = 0;
        while(x != 2110){
            ferrari.acelera();
            x++;
        }
        System.out.println("A velocidade da ferrari depois de "+ x+ " aceleradas eh: "+ ferrari.getVelocidade());

        int y = 0;
        while(y != 2110){
            ferrari.freia();
            y++;
        }
        System.out.println("A velocidade da ferrari depois de "+ y+ " freadas eh: "+ ferrari.getVelocidade());
    }

    static int multiplica(int x, int y){
        return x * y;
    }

}

