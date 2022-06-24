import java.util.Scanner;

public class main {

    public static void main (String [] args){
        int a = 5, b =5;
        int c = a + b;

        System.out.println("Valor de a: "+a+" Valor de b: "+b+" Valor da soma: "+c);

        int d = multiplica(a,b);
        System.out.println("D = "+ d);

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor de H: ");
        int h = teclado.nextInt();
        System.out.println("O valor digitado foi: "+h);
    }

    static int multiplica(int x, int y){
        int m = x * y;
        return m;
    }

}

