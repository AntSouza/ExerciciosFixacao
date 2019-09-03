public class TestaPorta {
    public static void main(String[] args){
        Porta porta = new Porta();
        porta.dimensaoX = 1.1;
        porta.dimensaoY = 1.9;
        porta.dimensaoZ = 0.7;
        porta.cor = "Vermelha";
        porta.aberta = true;        
        System.out.println("Informações iniciais: " + "\n" + "Dimensoes X, Y e Z: " + porta.dimensaoX + "," + porta.dimensaoY + ","
        + porta.dimensaoZ + "\n" + "Cor: " + porta.cor );  
        
        if(porta.estaAberta() == true){
            System.out.println("A porta esta aberta.");            
        }
        else{
            System.out.println("A porta esta fechada.");
        }
        
        porta.Fecha();
        
        if(porta.estaAberta() == true){
            System.out.println("A porta esta aberta.");            
        }
        else{
            System.out.println("A porta esta fechada.");
        }
        
        porta.dimensaoX = 1.4;
        porta.dimensaoY = 2.4;
        porta.dimensaoZ = 0.9;
        porta.pinta("Azul");
        porta.pinta("Verde");
        porta.pinta("Amarela");
        
        porta.Abre();
       
        System.out.println("Informações depois de trocadas: " + "\n" + "Dimensoes X, Y e Z: " + porta.dimensaoX + "," + porta.dimensaoY + ","
        + porta.dimensaoZ + "\n" + "Cor: " + porta.cor );  
        
        if(porta.estaAberta() == true){
            System.out.println("A porta esta aberta.");            
        }
        else{
            System.out.println("A porta esta fechada.");
        }
        
        
        
        
    }
}
