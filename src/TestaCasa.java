//ERRO, não conta as portas depois da primeira vez, CORRIGIR.

public class TestaCasa {
    public static void main(String[] args){
        Casa casa = new Casa();
        Porta porta1 =  new Porta();
        Porta porta2 =  new Porta();
        Porta porta3 =  new Porta();
        casa.cor = "Azul";
        porta1.dimensaoX = 1.3;
        porta1.dimensaoY = 1.5;
        porta1.dimensaoZ = 0.3;
        porta1.aberta = true;
        porta2.dimensaoX = 1.5;
        porta2.dimensaoY = 1.7;
        porta2.dimensaoZ = 0.9;
        porta2.aberta = true;
        porta3.dimensaoX = 1.9;
        porta3.dimensaoY = 1.6;
        porta3.dimensaoZ = 0.4;
        porta3.aberta = true;
        casa.porta1 = porta1;
        casa.porta2 = porta2;
        casa.porta3 = porta3;
        System.out.println("Cor inicial da casa: " + casa.cor + "\n" + "Quantas portas estao abertas: " + casa.quantasPortasEstaoAbertas());
        casa.pinta("Rosa");
        porta1.Fecha();
        porta2.Fecha();
        System.out.println("Cor depois da primeira mudança: " + casa.cor + "\n" 
         + "Quantas portas estao abertas agora: " + casa.quantasPortasEstaoAbertas());
        
        porta3.Fecha();
        casa.pinta("Branco");
        System.out.println("Cor depois da segunda mudança: " + casa.cor + "\n" 
         + "Quantas portas estao abertas agora: " + casa.quantasPortasEstaoAbertas());
    }
}
