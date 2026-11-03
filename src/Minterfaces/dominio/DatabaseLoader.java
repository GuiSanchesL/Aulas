package Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    //Uso do implements em vez  extends, por chamar uma interface.
    @Override
    public void load() {
        System.out.println("Carregando banco de dados");
    }
    @Override
    public void remove(){
         System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPremission() {
        System.out.println("Checando permisoes no banco de dados");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do Banco de Dados ");
    }
}
