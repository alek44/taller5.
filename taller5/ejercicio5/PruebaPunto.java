
package taller5.ejercicio5;

public class PruebaPunto {

    public static void main(String[] args) {

        Punto p0 = new Punto();
        System.out.println("Distancia 1: " + p0.calcularDistancia(18,23));

        Punto p1 = new Punto();
        System.out.println("Distancia 2: " + p1.calcularDistancia(12,7));

        Punto p2 = new Punto();
        Punto p = new Punto(15,18);
        System.out.println("Distancia 3: " + p2.calcularDistancia(p));
        
        Punto p3 = new Punto(4);
        System.out.println("Distancia 4: " + p3.calcularDistancia(9));
    }
}
