public class Casa {
    String cor;
    boolean aberta;
    Porta porta1;
    Porta porta2;
    Porta porta3;
    
    void pinta(String s){
        this.cor = s;
    }
    void Abre(){
        this.aberta = true;
    }
    void Fecha(){
        this.aberta = false;
    }
    
    
    int quantasPortasEstaoAbertas(){
        int cont = 0;        
        if(porta1.aberta == true){
            cont++;
        }
        if(porta2.aberta ==  true){
            cont++;
        }
        if(porta3.aberta == true){
            cont++;
        }
        return cont;}
    }