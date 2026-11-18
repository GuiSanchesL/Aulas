package Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExcepitionTest02 {
    public static void main(String[] args) {
        File file = new File("PastaFalsa/ArquivoTest02.txt");

        try {
            boolean criado = file.createNewFile();
            System.out.println("Arquivo Criado " + criado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}