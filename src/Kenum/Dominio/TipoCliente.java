package Kenum.Dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica"),
    ;
    public final int Cod;
    // Porque so final, e nao static ou static final.

    private String nomeRelatorio;
    // Pra tirar o nome em Caixa alta

    TipoCliente(int Cod, String nomeRelatorio) {
        this.Cod = Cod;
        this.nomeRelatorio=nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
      //Nao entendi Quase nada desse metodo aqui, entendi so que usa o value pra buscar alguma coisa
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
