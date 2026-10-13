package Kenum.Test;

import Kenum.Dominio.Cliente;
import Kenum.Dominio.TipoCliente;
import Kenum.Dominio.TipoPagamento;


public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Andersen", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Guilherme",TipoCliente.PESSOA_FISICA,TipoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);


        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa fisica");
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa física");
        System.out.println(tipoCliente1);
        System.out.println(tipoCliente2);




    }
}
