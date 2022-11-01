import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDemissaoTest {

    @Test
    void deveExecutarFormatura() {
        IServicoRH servico = ServicoFactory.obterServico("Demissao");
        assertEquals("Demissão efetivada", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServicoRH servico = ServicoFactory.obterServico("Demissao");
        assertEquals("Demissão cancelada", servico.cancelar());
    }

}