public class ServicoPagamento implements IServicoRH{
    @Override
    public String executar() {
        return "Pagamento efetivado";
    }

    @Override
    public String cancelar() {
        return "Pagamento cancelado";
    }
}
