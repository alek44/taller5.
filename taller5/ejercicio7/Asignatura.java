
package taller5.ejercicio7;

import java.util.Scanner;

public class Asignatura {
    String nombre;
    int cont1=0;
    int codigo;
    int n;
    int[] grupo;
    int[] n_grupo;
    String[] docente;
    int[] n_estu;
    String[] nombre_estu;
    float[] p1;
    float[] p2;
    float[] p3;
    float[] prom;
    
    public Asignatura(String nombre, int codigo, int n, int[] grupo, int[] n_grupo, String[] docente, int[] n_estu, String[] nombre_estu, float[] p1, float[] p2, float[] p3, float[] prom) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.n = n;
        this.grupo = grupo;
        this.n_grupo = n_grupo;
        this.docente = docente;
        this.n_estu = n_estu;
        this.nombre_estu = nombre_estu;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.prom = prom;
    }

    public Asignatura() {
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getGrupo() {
        return grupo;
    }

    public void setGrupo(int[] grupo) {
        this.grupo = grupo;
    }

    public int[] getN_grupo() {
        return n_grupo;
    }

    public void setN_grupo(int[] n_grupo) {
        this.n_grupo = n_grupo;
    }

    public String[] getDocente() {
        return docente;
    }

    public void setDocente(String[] docente) {
        this.docente = docente;
    }

    public int[] getN_estu() {
        return n_estu;
    }

    public void setN_estu(int[] n_estu) {
        this.n_estu = n_estu;
    }

    public String[] getNombre_estu() {
        return nombre_estu;
    }

    public void setNombre_estu(String[] nombre_estu) {
        this.nombre_estu = nombre_estu;
    }

    public float[] getP1() {
        return p1;
    }

    public void setP1(float[] p1) {
        this.p1 = p1;
    }

    public float[] getP2() {
        return p2;
    }

    public void setP2(float[] p2) {
        this.p2 = p2;
    }

    public float[] getP3() {
        return p3;
    }

    public void setP3(float[] p3) {
        this.p3 = p3;
    }

    public float[] getProm() {
        return prom;
    }

    public void setProm(float[] prom) {
        this.prom = prom;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public void Asignature() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese nombre de asignatura: ");
        nombre = entrada.nextLine();
        System.out.println("ingrese codigo de asignatura: ");
        codigo = entrada.nextInt();
        
    }
    
    public void grupos() {
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("cuantos grupos son? :");
            n = entrada.nextInt();
            if (n>=4){
                System.out.println("cada asignatura debe tener maximo 3 grupos.");
            }
          }
         while (n>=4);
        grupo = new int[n];
        n_grupo = new int[n];
        docente = new String[n];
        n_estu = new int [n];
        nombre_estu = new String[10];
        p1 = new float[10];
        p2 = new float[10];
        p3 = new float[10];
        prom = new float[10];
        
        System.out.println(" ****GRUPOS*** ");
        for (int i=1; i<=grupo.length; i++){
            System.out.println("ingrese numero del grupo #"+i+": ");
            n_grupo[i-1] = entrada.nextInt();
            entrada.nextLine();
            System.out.println("ingrese el nombre del docente: ");
            docente[i-1] = entrada.nextLine();
            do{
                System.out.println("ingrese el numero de estudiantes");
                n_estu[i-1] = entrada.nextInt();
                cont1 += n_estu[i-1];
                if (n_estu[i-1]>=4){
                    System.out.println("no pueden haber incritos mas de 3");
                }
            }
            while (n_estu[i-1]>=4);
        }
        System.out.println("");
        for (int j=1; j<=cont1; j++){
            entrada.nextLine();
            System.out.println("ingrese el nombre del estudinate #"+j);
            nombre_estu[j-1] = entrada.nextLine();
            System.out.println("ingrese su nota 1:");
            p1[j-1] = entrada.nextFloat();
            System.out.println("ingrese su nota 2:");
            p2[j-1] = entrada.nextFloat();
            System.out.println("ingrese su nota 3:");
            p3[j-1] = entrada.nextFloat();
            System.out.println("");
            prom[j-1] = (p1[j-1] + p2[j-1] + p3[j-1]) / 3;
        }
          
    }
    public void mostrarGrupos() {
        Scanner entrada = new Scanner(System.in);
        int opci;
        String opcion="";
        do {
            System.out.println("digite la opcion que desea: ");
            System.out.println("1. mostrar los grupos");
            System.out.println("2. mostrar promedio de estudiantes");
            opci = entrada.nextInt();
            switch (opci){
                case 1: 
                    for (int i=1; i<=grupo.length; i++){
                        System.out.println("numero del grupo #"+i+" :");
                        System.out.println(n_grupo[i-1]);
                        System.out.println("docente del grupo #"+i+" :");
                        System.out.println(docente[i-1]);
                        System.out.println("estudiantes del grupo #"+i+" :");
                        System.out.println(n_estu[i-1]);
                        System.out.println("");
                    }
                    
                case 2:
                    for (int i=1; i<=cont1; i++){
                        System.out.println("nombre del estudiante #"+i+" :");
                        System.out.println(nombre_estu[i-1]);
                        System.out.println("promedio del estdiante #"+i+" :");
                        System.out.println(prom[i-1]);
                        System.out.println("");

                    }
                    }
            
            System.out.println("regresar al menu anteior?");
            entrada.nextLine();
            System.out.println("  s(si) o n(no)");
            opcion = entrada.nextLine();
            System.out.println("");
        }
        while ("s".equals(opcion));
    }
    
    public void mostrarAsignatura() {
        System.out.println("");
        System.out.println("nombre de la asignayura: "+nombre);
        System.out.println("codigo de la asignatura: "+codigo);
        System.out.println("");
    }
            
}
