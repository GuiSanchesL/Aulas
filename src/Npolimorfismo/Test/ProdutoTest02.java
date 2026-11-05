package Npolimorfismo.Test;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.servico.calculadoraImposto;
public class ProdutoTest02 {
    public static void main(String[] args) {


        Produto produto1 = new Computador("Ryzen 9 ", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2026");
        calculadoraImposto.calcularImposto(tomate);
        System.out.println("===========================================");
        calculadoraImposto.calcularImposto(produto1);

    }
}