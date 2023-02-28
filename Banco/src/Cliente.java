import java.util.Date;
//herda da classe Pessoa pois um cliente É UMA pessoa
//utilizando composição para conta pois um cliente TEM UMA conta
public class Cliente extends Pessoa{
    private Date dataRegistro;
    private Conta conta;

    public void setCliente (String nome, String profissao,long cpf){
        super.SetPessoa(nome, profissao, cpf);
        dataRegistro = new Date();
    }

    public void setConta (Agencia agencia){
        this.conta = new Conta();
        conta.setConta(agencia);
    }

    public void mostraCliente(){
        super.mostraPessoa();
        System.out.println("Data de registro: " + this.dataRegistro);
    }

    public void mostraConta(){
        this.conta.mostraConta();
    }

}
