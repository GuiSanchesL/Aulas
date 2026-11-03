package Lclassesabstratas.Test;

import Lclassesabstratas.dominio.Desenvolvedor;
import Lclassesabstratas.dominio.Estagiario;
import Lclassesabstratas.dominio.Funcionario;
import Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Anderson",25000);
        //System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Guilherme", 10000);
       // System.out.println(desenvolvedor);
        Estagiario estagiario = new Estagiario("Luiza",2000);
        Funcionario [] funcionarios = {gerente,desenvolvedor,estagiario};
        for (Funcionario funcionario: funcionarios){
            System.out.println(funcionario);
        }

    }
}