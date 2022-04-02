package taller5.ejercicio2;

public class PruevaParrafo {
    public static void main(String[] args){
    String texto = "Estoy en mi cuarto, aprendiendo en you tube, sobre String en JavadesdeCero%";    
    Parrafo str = new Parrafo(texto);
    str.nVocales(texto);
    str.nConsonantes(texto);
    str.nSimbolos(texto);
    str.buscar(texto, "en");
    str.vocalModal(texto, "e");
    str.nPalabras(texto);
    str.palabraMayor(texto);
        
    }
}
