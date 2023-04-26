package main;

public class ClienteFacade {
    public static boolean verificarPendenciasMensais(Cliente cliente) {
        if (Caixa.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (AgenteComercial.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Gerente.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
