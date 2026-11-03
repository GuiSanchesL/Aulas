package Minterfaces.dominio;

import java.util.Map;

public interface DataLoader {
   public static final int MAX_DATA_SIZE=10;
   //Os atributos nas interfaces por padrao tem que ser static final
    // Tambem pode ser aplicado direto como por exemplo int numero = 5;
    void load();
    //Por padrao todas as interfaces vem com o metodo public abstract
    default void checkPremission(){
       //Uso do default para colodcar "Funcionalidade" dentro de um metodo
        System.out.println("Fazendo chegagem de permissoes");
    }
    static void retrieveMaxDataSize(){
        System.out.println("Dentro do DataLoader");
    }
}
