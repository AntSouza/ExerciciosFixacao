public class TestaEsfera {
    public static void main(String[] args){
        Esfera esfera = new Esfera();
        esfera.raio = 5;
        double resultado = esfera.volume(esfera.raio);
        System.out.println("Uma esfera de raio " + esfera.raio + " tem " + resultado + " de volume em cm³");
    }
}
