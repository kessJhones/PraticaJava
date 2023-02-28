public class App {
    public static void main(String[] args) throws Exception {
        Agencia agencia = new Agencia();
        agencia.SetAgencia("shopping sul", 66, "cloves de barros");
        Cliente cliente = new Cliente();
        cliente.setCliente("Joao caminhao","caminhoneiro", 88723323);
        cliente.mostraCliente();
        cliente.setConta(agencia);
        cliente.mostraConta();

    }
}
