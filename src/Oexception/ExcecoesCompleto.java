 package Oexception;

import   java.io.File;
import java.io.IOException;

public class ExcecoesCompleto {

    public static void main(String[] args) {

        // 1. UNCHECKED lançada por nós (throw).
        //    Sem try/catch o código compilaria, mas quebraria ao rodar.
        try {
            System.out.println(dividir(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        // 2. CHECKED lançada por um método do Java (createNewFile).
        //    O tratamento está dentro do método criarArquivo().
        criarArquivo();

        // 3. CHECKED lançada por nós (throw + throws).
        //    O compilador OBRIGA a tratar aqui: try/catch ou throws no main.
        try {
            lerArquivo("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Roda porque todas as exceções acima foram tratadas
        System.out.println("Código finalizado");
    }

    // UNCHECKED: throws na assinatura seria opcional
    private static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b não pode ser zero");
        }
        return a / b;
    }

    // CHECKED tratada dentro do método: o createNewFile() lança IOException.
    // O arquivo é criado na raiz do projeto, então não depende de nenhuma pasta.
    private static void criarArquivo() {
        File file = new File("teste.txt");
        try {
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado: " + criado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CHECKED lançada por nós: o throws na assinatura é OBRIGATÓRIO.
    // Ele passa a responsabilidade de tratar pra quem chamar o método.
    private static void lerArquivo(String caminho) throws IOException {
        if (caminho.isEmpty()) {
            throw new IOException("Caminho do arquivo inválido");
        }
        System.out.println("Lendo " + caminho);
    }
}