package Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExcepitionTest01 {
    public static void main(String[] args) {
                criarArquivo();
    }
    public static void criarArquivo(){
        File file = new File("arquivo\\teste.txt");
        //Usamos o pacote File porque precisasos da variavel de referencia do java.io
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Aquivo criado" + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
