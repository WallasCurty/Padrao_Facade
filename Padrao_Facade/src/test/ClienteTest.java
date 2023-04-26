package test;

import org.junit.jupiter.api.Test;

import main.AgenteComercial;
import main.Cliente;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void deveRetornarPendenciaCaixa() {
        Cliente cliente = new Cliente();
        Caixa.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.analisar());
    }

    @Test
    void deveRetornarPendenciaComAgenteComercial() {
        Cliente cliente = new Cliente();
        AgenteComercial.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.analisar());
    }

    @Test
    void deveRetornarPendenciaComGerente() {
        Cliente cliente = new Cliente();
        Gerente.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.analisar());
    }

    @Test
    void deveRetornarClienteSemPendenciaBanco() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.analisar());
    }
}
