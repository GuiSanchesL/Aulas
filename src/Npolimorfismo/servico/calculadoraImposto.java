package Npolimorfismo.servico;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Tomate;

public class calculadoraImposto {
    public void calculadoraImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto computador");
        double imposto= computador.calcularImposto();
        System.out.println("Nome do computador =>"+computador.getNome());
        System.out.println("Valor do computador =>"+computador.getValor());
        System.out.println("Imposto do computador =>"+imposto);
    }
    public void calculadoraImpostoTomate(Tomate tomate){
        System.out.println("Relatorio do imposto tomate");
        double imposto= tomate.calcularImposto();
        System.out.println("Tomate =>"+ tomate.getNome());
        System.out.println("Valor Tomate =>"+ tomate.getValor());
        System.out.println("Imposto do tomate=>" + imposto);
    }

}
