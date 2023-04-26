package main;

public class AgenteComercial extends Setor {
    private static AgenteComercial agenteComercial = new AgenteComercial();

    private AgenteComercial() {};

    public static AgenteComercial getInstancia() {
        return agenteComercial;
    }
}
