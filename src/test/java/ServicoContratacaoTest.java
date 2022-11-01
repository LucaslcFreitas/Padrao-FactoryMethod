import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoContratacaoTest {

    @Test
    void deveExecutarFormatura() {
        IServicoRH servico = ServicoFactory.obterServico("Contratacao");
        assertEquals("Contratação efetivada", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServicoRH servico = ServicoFactory.obterServico("Contratacao");
        assertEquals("Contratação cancelada", servico.cancelar());
    }
}