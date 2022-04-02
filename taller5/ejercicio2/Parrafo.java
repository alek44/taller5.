
package taller5.ejercicio2;
import java.util.StringTokenizer;

public class Parrafo {
    String texto;

    
    public Parrafo() {
        
    }
    
    public Parrafo(String texto) {
        this.texto = texto;
    }   

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    public void nVocales(String str) {
        int n_voc=0;
        char[] vocales= {'a','e','i','o','u'};
        for (int i=0; i<str.length();i++){
            for (int j=0; j<vocales.length;j++){
                if (str.charAt(i) == vocales[j]){
                    n_voc++;
                }
            }
        }
        System.out.println("el numero de vocales es: "+n_voc);
    }
    
    public void nConsonantes(String str) {
        int n_conso=0;
        char[] consonantes= {'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
        for (int i=0; i<str.length();i++){
            for (int j=0; j<consonantes.length;j++){
                if (str.charAt(i) == consonantes[j]){
                    n_conso++;
                }
            }
        }
        System.out.println("el numero de consonantes es: "+n_conso);
    }
    
    public void nSimbolos(String str){
        int n_simbo=0;
        char[] simbolos= {'°','!','"','#','$','%','&','/','(',')','=','?','¡','¿','+','*',';',':','-','_','{','}'};
        for (int i=0; i<str.length();i++){
            for (int j=0; j<simbolos.length;j++){
                if (str.charAt(i) == simbolos[j]){
                    n_simbo++;
                }
            }
        }
        System.out.println("el numero de simbolos es: "+n_simbo);
    }
    
    public void buscar(String str, String palabra) {
        int tub;
        int cont=0;
        tub=str.indexOf(palabra);
        while (tub!=-1) {
            cont++;
            tub=str.indexOf(palabra,tub+1);
        }
        System.out.println("las veces q se repite *"+palabra+"* son: "+cont);
    }
    
    public void vocalModal(String str, String voc) {
        int tub;
        int cont=0;
        tub=str.indexOf(voc);
        while (tub!=-1) {
            cont++;
            tub=str.indexOf(voc,tub+1);
        }
        System.out.println("las veces q se repite la vocal *"+voc+"* son: "+cont);
    }
    
    public void nPalabras(String str) {
        StringTokenizer num = new StringTokenizer(str, " ");
        while (num.hasMoreElements()){
            System.out.println("palabra :" + num.nextElement());
        }
    }
    
    public void palabraMayor(String str) {
        int longitud=0;
        int posicion=0;
        int mayor=0;
        int posMayor=0;
        for (int i=0; i<str.length();i++) {
            while (! Character.isLetter(str.charAt(i)) && (i+1)<str.length()){
                i++;
            }
            posicion = i;
            longitud = 0;
            while (Character.isLetter(str.charAt(i)) && (i+1)<str.length()){
                longitud++;
                i++;    
            }
            if (longitud>mayor){
                mayor = longitud;
                posMayor=posicion;
            }
        }
        String palabra = "";
        for (int i=0; i<mayor; i++){
            palabra=palabra.concat(String.valueOf(str.charAt(posMayor+i)));
        }
        System.out.println("la palabra mas larga es *"+ palabra +"* y tiene "+ mayor +" caracteres");
    }
    
}
