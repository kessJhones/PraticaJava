public class Pessoa {
    protected String nome;
    protected String profissao;
    protected long cpf;


    public void SetPessoa (String nome, String profissao,long cpf){
        this.nome = nome;
        this.profissao = profissao;
        this.cpf = cpf; 
    }

    public void mostraPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Profissao: " + this.profissao);
        System.out.println("CPF: " + this.cpf);
    }
}
