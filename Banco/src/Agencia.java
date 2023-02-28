public class Agencia {
    private String nomeAgencia;
    private int numeroAgencia;
    private String nomeGerente;
    private int numeroClientes;

    public void SetAgencia (String agencia, int numero, String gerente){
        this.nomeAgencia = agencia;
        this.nomeGerente = gerente;
        this.numeroAgencia = numero;
        this.numeroClientes = 30;
    }

    public void modificaNumeroClientes (int numero){
        this.numeroClientes += numero;
    }

    public int geraNumeroConta (){
        return 1000 * this.numeroAgencia + this.numeroClientes;
    }

    public void mostraAgencia(){
        System.out.println("Numero da agencia: " + this.numeroAgencia);
    }
}
