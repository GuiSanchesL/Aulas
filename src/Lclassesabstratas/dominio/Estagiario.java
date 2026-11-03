package Lclassesabstratas.dominio;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.02;
    }

    @Override
    public void calcularSalarioAnual() {

    }

    @Override
    public String toString() {
        return "Estagiario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
