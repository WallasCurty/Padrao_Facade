package main;

public class Cliente {

    public boolean analisar() {
        return ClienteFacade.verificarPendenciasMensais(this);
    }
}
