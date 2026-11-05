package Npolimorfismo.Test;

import Npolimorfismo.repositorio.Repositorio;
import Npolimorfismo.servico.RepositorioArquivo;
import Npolimorfismo.servico.RepositorioBancoDeDados;
import Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List <String> list = new ArrayList<>();
        list.add("Gui");
        list.add("Flavia");
        list.add("Andersen");
        list.add("gabi");
        list.add("Lu");
        list.add("Filo");
        System.out.println(list);
        //Para mudancas é melhor colocar uma classe mais especifica,
        //colocamos um tipo mais generico, para nao dar erro exemplo de Repositorio e ai
        // nao atrapalha o nosso new podendo manipular bem melhor
    }
}
