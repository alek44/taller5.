package taller5;

public class main {
    public static void main(String[] args) {
       Persona pers1[] = {new Persona("jhonatan",17,1066855654,0700056,3276,40982),new Persona("ever",23,1077654365,98758,3127,39874),new Persona("linda",26,1077465354,49873,3984,23984) };
       Fecha perso1[] = {new Fecha(05,"noviembre",2000),new Fecha(23,"octubre",1999),new Fecha(12,"febrero",1987)};
       Direccion person1[] = { new Direccion("bogota", "sincelejo", 23, "calle:18e60","banco"),new Direccion("ecuador", "chimic", 15, "calle:12i87","restaurante"),new Direccion("chile", "malambo", 7, "calle:36k49","hospital")};
       for (int i=0; i<pers1.length;i++){
            System.out.println("**** persona #"+i+" **** ");
            System.out.println("nombre: "+pers1[i].getNombre());
            System.out.println("edad: "+pers1[i].getEdad());
            System.out.println("cedula: "+pers1[i].getCedula());
            System.out.println("fecha de nacimiento: ");
            System.out.println("dia: "+perso1[i].getDia());
            System.out.println("mes: "+perso1[i].getMes());
            System.out.println("año: "+perso1[i].getAño());
            System.out.println("direccion de domicilio: "+pers1[i].getDirecciondomicilio());
            System.out.println("ciudad: "+person1[i].getCiudad());
            System.out.println("barrio: "+person1[i].getBarrio());
            System.out.println("carrera: "+person1[i].getCarrera());
            System.out.println("calle: "+person1[i].getCodigo());
            System.out.println("direccion de trabajo: "+pers1[i].getDirecciontrabajo());
            System.out.println("nombre del lugar de trabajo: "+person1[i].getTrabajo());
            System.out.println("");
            

       }
        
    }
}
