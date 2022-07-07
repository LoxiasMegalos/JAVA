package murillo.projeto;

public class Banco {
    
    public static void main(String[] args){
        ByteBank contaMurillo = new ByteBank("Murillo", 1234, 1234);
        contaMurillo.Deposita(1000);

        ByteBank contaRaissa = new ByteBank("Raissa", 5678, 5678);
        contaRaissa.Deposita(900);

        System.out.println("O saldo de Murillo eh: "+ contaMurillo.VerificaSaldo());
        System.out.println("O saldo de Raissa eh: "+ contaRaissa.VerificaSaldo());
        System.out.println("--------------------------------------------------");

        contaRaissa.Transfere(contaMurillo, 900.1);

        System.out.println("O saldo de Murillo eh: "+ contaMurillo.VerificaSaldo());
        System.out.println("O saldo de Raissa eh: "+ contaRaissa.VerificaSaldo());
        System.out.println("--------------------------------------------------");
    }

}
