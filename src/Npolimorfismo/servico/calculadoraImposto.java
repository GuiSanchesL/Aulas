package Npolimorfismo.servico;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;

public  class calculadoraImposto {
//    public static void calculadoraImpostoComputador(Computador computador) {
//
//        System.out.println("Relatorio de imposto computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Nome do computador =>" + computador.getNome());
//        System.out.println("Valor do computador =>" + computador.getValor());
//        System.out.println("Imposto do computador =>" + imposto);
//    }
//
//    public static void calculadoraImpostoTomate(Tomate tomate) {
//        System.out.println("Relatorio do imposto tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate =>" + tomate.getNome());
//        System.out.println("Valor Tomate =>" + tomate.getValor());
//        System.out.println("Imposto do tomate=>" + imposto);

//Agora com o polimorfismo a gente pode economizar codigo,
    //Porque como podemos ver a gente consegue utilizar a super classe como parametro para pooder chamar
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio do imposto produtos");
        double imposto= produto.calcularImposto();
        System.out.println("Produto:"+produto.getNome());
        System.out.println("Preço:"+produto.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }

}
