package murillo.projeto.CursoExceptions;

public class TesteException {

    public static void main(String[] args) {

        int x = 0;
        int resultado;
        try{
            resultado = 10 / x;
        } catch (ArithmeticException e){
            //e.printStackTrace();
            x = 2;
            resultado = 10 / x;
        }

        System.out.println(resultado);

        //Java como uma pilha de chamada e execução
        //Rastro da pilha - mensagem de erro
        // Try - alerta o programa de uma possível chamada de erro
        // Catch(Erro e) - referência para um objeto de erro

        try{
            metodo1();
        } catch (ArithmeticException e){
            System.out.println("Peguei um erro! " + e.getLocalizedMessage());

        }

    }

    private static void metodo1() {
        metodo2();
    }

    private static void metodo2() {
        int z = 1 / 0;
    }
}
