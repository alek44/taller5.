package taller5;

public class Persona {
    String nombre;
    int edad;
    long cedula;
    long fechanacimiento;
    int direcciondomicilio;
    int direcciontrabajo;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public long getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(long fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getDirecciondomicilio() {
        return direcciondomicilio;
    }

    public void setDirecciondomicilio(int direcciondomicilio) {
        this.direcciondomicilio = direcciondomicilio;
    }

    public int getDirecciontrabajo() {
        return direcciontrabajo;
    }

    public void setDirecciontrabajo(int direcciontrabajo) {
        this.direcciontrabajo = direcciontrabajo;
    }
    

    public Persona(String nombre, int edad, long cedula, long fechanacimiento, int direcciondomicilio, int direcciontrabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.fechanacimiento = fechanacimiento;
        this.direcciondomicilio = direcciondomicilio;
        this.direcciontrabajo = direcciontrabajo;
    }
    
        
        public void datos() {
            
        }
}
