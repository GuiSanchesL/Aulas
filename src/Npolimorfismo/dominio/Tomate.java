package Npolimorfismo.dominio;

public class Tomate extends Produto{
    private String dataValidade;
    public static final double TAXA = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando taxa do tomate");
            return this.valor * TAXA;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
