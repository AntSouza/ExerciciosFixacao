public class TestaAluno {
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        Data data_a1 = new Data();
        a1.cpf = "000.111.222.33";
        a1.nome = "Blue";
        data_a1.dia = 24;
        data_a1.mes = 4;
        data_a1.ano = 2000;
        a1.dataDeNascimento = data_a1;
        
        String dados = a1.imprimir();
        System.out.println(dados);
        
    }
}
