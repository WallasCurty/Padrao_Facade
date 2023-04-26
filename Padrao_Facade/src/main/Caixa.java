package main;

public class Caixa extends Setor{
    private static Caixa caixa = new Caixa();

    private Caixa() {};

    public static Caixa getInstancia() {
        return caixa;
    }
}
