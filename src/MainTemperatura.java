public class MainTemperatura {
    public static void main(String[] args){ 
        Temperatura teste = new Temperatura();
        double valor = 95.0;
        double resultado;
        resultado =  teste.coverterParaCelsius(valor);
        System.out.println("95° fahrenheit em celsius é: " + resultado);
        
        valor = 37;
        resultado = teste.converterParaFahrenheit(valor);
        System.out.println("37° celsius em fahrenheit é: " + resultado);
    }  
}