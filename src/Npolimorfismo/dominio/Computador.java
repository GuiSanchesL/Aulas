package Npolimorfismo.dominio;

public class Computador extends Produto {
    public static final double TAXA = 0.20;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto computador =>");
        return this.valor * TAXA;
    }

}
