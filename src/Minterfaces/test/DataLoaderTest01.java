package Minterfaces.test;

import Minterfaces.dominio.DataLoader;
import Minterfaces.dominio.DatabaseLoader;
import Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPremission();


        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
//Entendi essas duas chamadas so nao entendi do porque sao chamadas direto pela classe
    }
}
