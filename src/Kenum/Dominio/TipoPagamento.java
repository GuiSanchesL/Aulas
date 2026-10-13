package Kenum.Dominio;

public enum TipoPagamento {
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1 ;
            }
        },
        CREDITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };
        public abstract double calcularDesconto(double valor);
        //Explica claude, eu entendi que ele precisa exister para poder ser sobreescrito
    }