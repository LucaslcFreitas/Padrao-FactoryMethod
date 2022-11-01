public class ServicoContratacao implements IServicoRH {
    @Override
    public String executar() {
        return "Contratação efetivada";
    }

    @Override
    public String cancelar() {
        return "Contratação cancelada";
    }
}
