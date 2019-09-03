public class Data {
    int dia;
    int mes;
    int ano;    
    
    String imprimir(){
        String data = this.dia + "/" + this.mes + "/" + this.ano;
        return data;
    }
}
