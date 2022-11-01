public class ServicoFactory {

    public static IServicoRH obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Servico"+servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IServicoRH)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServicoRH) objeto;
    }
}
