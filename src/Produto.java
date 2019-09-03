public class Produto {
    String nome;
    double preço;
    
     double diminuir10(double p){
         return this.preço*0.9;
     }
     
     double aumenta25(double p){
         return this.preço*1.25;
     }
}
