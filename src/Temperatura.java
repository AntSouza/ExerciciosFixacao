public class Temperatura {    
    double coverterParaCelsius(double n){
        double c = (n-32)/1.8;
        return c;        
    }   
    
    double converterParaFahrenheit(double n){
        double f = (n*1.8) + 32;
        return f;         
    }
}
