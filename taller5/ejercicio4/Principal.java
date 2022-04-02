package taller5.ejercicio4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;


public class Principal {
    public static SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM/yyyy");
    
    public static void main(String [] args){
        Date fechaActual= new Date();
        LocalDate sumFecha = LocalDate.now();
        LocalTime horaActual= LocalTime.now();
        
        LocalDate fechaActual2 = LocalDate.now();
        LocalDate restaFecha = fechaActual2.plusDays(-1);
        
        
        ClaseFecha op= new ClaseFecha(fechaActual, horaActual, sumFecha, restaFecha);
        
        op.fechaActual();
        op.sumaFecha(10);
        op.restaFecha(-1);
        op.nDias("18/05/2022", "21/06/2022");
        op.diaDelAño();
        op.compararFechas("18/05/2022", "21/06/2022");
        op.tiempoTranscurrido("01/01/2000", "01/01/2022");
        op.nombreDia();
        
        
    }
    
}