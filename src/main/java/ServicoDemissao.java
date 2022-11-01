public class ServicoDemissao implements IServicoRH{
    @Override
    public String executar() {
        return "Demissão efetivada";
    }

    @Override
    public String cancelar() {
        return "Demissão cancelada";
    }
}
