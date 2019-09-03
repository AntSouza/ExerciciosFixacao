public class Porta {
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    
    void Abre(){
         this.aberta = true;
    }
    void Fecha(){
         this.aberta = false;
    }
    void pinta(String s){
        this.cor = s;
    }
    boolean estaAberta(){
        if(this.aberta == true){
            return true;            
        }
        else 
            return false;
    }
}
