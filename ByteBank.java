package murillo.projeto;

public class ByteBank {
    
    private String titular;
    private double saldo;
    private int numero;
    private int agencia;

    public ByteBank(String titular, int numero, int agencia){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    public void Deposita(double dinheiro){
        this.saldo += dinheiro;
    }

    public boolean ProtegeTranferencia(double dinheiro){
        
        if(saldo - dinheiro < 0 ){
            saldo += dinheiro;
            throw new IllegalArgumentException("Você não tem saldo suficiente para transferir");
        }
        return true;
    }

    public double VerificaSaldo(){
        return saldo;
    }

    public void Transfere(ByteBank ByteBank, double dinheiro){
        if(ProtegeTranferencia(dinheiro)){
            saldo -= dinheiro;
            ByteBank.Deposita(dinheiro);
        }
            
    }
}
