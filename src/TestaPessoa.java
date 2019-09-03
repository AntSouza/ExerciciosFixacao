public class TestaPessoa {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.nome = "Red";
        p1.idade = 19;
        System.out.println("Idade inicial:" + p1.idade);
        p1.fazAniversario(p1.idade);
        System.out.println("Depois do primeiro aniversario: " + p1.idade);
        for(int i = 0; i < 4; i++){
             p1.fazAniversario(p1.idade);
        }
        System.out.println("Depois de mais 4 aniversarios: " + p1.idade);
    }
    
}
