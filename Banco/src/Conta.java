public class Conta {
    private double saldo;
    private Agencia agencia;
    private int numero;

    public void setConta(Agencia agencia){
        this.saldo = 0;
        this.agencia = agencia;
        this.numero = agencia.geraNumeroConta();
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca (double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }

        return false;
    }

    public void mostraSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    public boolean transfere (double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }

        return false;
    }

    public void mostraConta(){
        this.agencia.mostraAgencia();
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}

