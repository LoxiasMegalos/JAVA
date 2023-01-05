package murillo.projeto.CursoExceptions;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("inicio main");
        try{
            metodo1();
        } catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("fim main");
    }

    private static void metodo1() {
        System.out.println("inicio m1");
        metodo2();
        System.out.println("fim m1");
    }

    private static void metodo2() {
        System.out.println("inicio m2");

        throw new ArithmeticException("deu errado"); // variavel erro aponta para um objeto salvo em Heap

        //System.out.println("fim m2");
    }
}
