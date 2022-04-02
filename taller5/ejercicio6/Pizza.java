package taller5.ejercicio6;


public class Pizza {
    String tamaño;
    String tipo;
    String estado;
    int cPedida=0;
    int cServida=0;
    int cont=0;
    String modo = "pedida";

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getcPedida() {
        return cPedida;
    }

    public void setcPedida(int cPedida) {
        this.cPedida = cPedida;
    }

    public int getcServida() {
        return cServida;
    }

    public void setcServida(int cServida) {
        this.cServida = cServida;
    }
    
    
    
    public Pizza (String tipo, String tamaño){
        this.tipo=tipo;
        this.tamaño=tamaño;
        
        cPedida = cPedida + 3;
        System.out.println("Pizza "+tipo+" "+tamaño+", "+modo);
        
    }
    
    public void sirve(){
        
        if (cont == 0){
            System.out.println("---SERVIDA---");
            cServida= + 1;
        }
        else {
            System.out.println("esta pizza ya se ha servido");
        }
        cont = 1;
    }

    
    
    public int getTotalPedidas(){
        System.out.println("");
        return cPedida;
    }
    
    public int getServidas(){
        return cServida;
    }
    
}
