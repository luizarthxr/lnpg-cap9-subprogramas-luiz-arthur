public class PassagemPorValor {

    public static void alterarNumero(int x) {
        System.out.println("Valor dentro do método antes: " + x);

        x = 100;

        System.out.println("Valor dentro do método depois: " + x);
    }

    public static void main(String[] args) {
        int numero = 50;

        System.out.println("Valor no main antes: " + numero);

        alterarNumero(numero);

        System.out.println("Valor no main depois: " + numero);
    }
}
