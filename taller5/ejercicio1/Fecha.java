package taller5;

public class Fecha {
        int dia;
        String mes;
        int año;

        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public String getMes() {
            return mes;
        }

        public void setMes(String mes) {
            this.mes = mes;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public Fecha(int dia, String mes, int año) {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        }
        
        
    }
