package murillo.projeto;
import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args){

        System.out.println("Ola Mundo!");

        ArrayList<Carro> meusCarros = new ArrayList<Carro>();

        Carro ferrari = new Carro(20,350);
        Carro mercedes = new Carro(18, 352);
        Carro renault = new Carro(17, 357);

        System.out.println("Ferrari: "+ ferrari.getVelocidade()+" Mercedes: "+ mercedes.getVelocidade()+" Renault: "+ renault.getVelocidade());

        meusCarros.add(ferrari);
        meusCarros.add(mercedes);
        meusCarros.add(renault);

        System.out.println(meusCarros.get(1).getVelocidade());
        System.out.println(meusCarros.size());
        
    }

}
