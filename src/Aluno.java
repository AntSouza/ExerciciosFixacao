public class Aluno {
    String nome;
    String cpf;
    Data dataDeNascimento;
    
    String imprimir(){
        String dados = this.nome + "\n" + this.cpf + "\n" + this.dataDeNascimento.imprimir();
        return dados;
    }
}
