/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5;

/**
 *
 * @author asus
 */
public class Direccion {
        String ciudad;
        String barrio;
        int carrera;
        String codigo;
        String trabajo;

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public String getBarrio() {
            return barrio;
        }

        public void setBarrio(String barrio) {
            this.barrio = barrio;
        }

        public int getCarrera() {
            return carrera;
        }

        public void setCarrera(int carrera) {
            this.carrera = carrera;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }


        public Direccion(String ciudad, String barrio, int carrera, String codigo, String trabajo) {
            this.ciudad = ciudad;
            this.barrio = barrio;
            this.carrera = carrera;
            this.codigo = codigo;
            this.trabajo = trabajo;
        }
}