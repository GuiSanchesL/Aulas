package Oexception.runtime.test;

public class RunTimeExeptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            {
                e.printStackTrace();
            }
            System.out.println("Codigo Finalizado");
        }
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("ARGUMENTO ILEGAL");
        }
        return a / b;
    }
}