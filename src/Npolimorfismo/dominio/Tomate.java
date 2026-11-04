package Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double TAXA = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando taxa do tomate");
            return this.valor * TAXA;
    }
}
