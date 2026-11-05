package Npolimorfismo.Test;

import BintroduçãoMetodos.Dominio.Calculadora;
import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Televisao;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.servico.calculadoraImposto;
public class ProdutoTest {
    public static void main(String[] args) {
//        Computador computador = new Computador("MacBook neo ", 5000);
//        Tomate tomate = new Tomate("Tomate",4.67);
//        calculadoraImposto.calculadoraImpostoComputador(computador);
//        System.out.println("---------------------------------------------------");
//        calculadoraImposto.calculadoraImpostoTomate(tomate);
        Computador computador = new Computador("Mac book pro m5", 15000);
        Tomate tomate = new Tomate("Tomate Sisiliano", 22);
        Televisao TV = new Televisao("Sansung 50\"",5000);

        calculadoraImposto.calcularImposto(computador);
        System.out.println("=======================================");

        calculadoraImposto.calcularImposto(tomate);
        System.out.println("=======================================");
        calculadoraImposto.calcularImposto(TV);



    }
}
