package murillo.projeto;

public class Carro {
    
    private int velocidade_maxima;
    private int potencia_do_motor;
    private int velocidade;

    public Carro(int potencia_do_motor, int velocidade_maxima){
        this.potencia_do_motor = potencia_do_motor;
        this.velocidade_maxima = velocidade_maxima;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void acelera(){
        velocidade = velocidade + potencia_do_motor;
        if(velocidade > velocidade_maxima)
            velocidade = velocidade_maxima;
    }

    public void freia(){
        velocidade = velocidade - potencia_do_motor;
        if(velocidade < 0)
            velocidade = 0;
    }
}
