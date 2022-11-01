import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPagamentoTest {

    @Test
    void deveExecutarFormatura() {
        IServicoRH servico = ServicoFactory.obterServico("Pagamento");
        assertEquals("Pagamento efetivado", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServicoRH servico = ServicoFactory.obterServico("Pagamento");
        assertEquals("Pagamento cancelado", servico.cancelar());
    }
}