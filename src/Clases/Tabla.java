
package Clases;

import java.util.ArrayList;

public class Tabla {
    
    String nombre;
    String descripcion;
    ArrayList<Campo> campos;
    

    public Tabla(String nombre, String descripcion,Campo campo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        campos.add(campo);
    }

    public void addCampo(Campo campo){
        campos.add(campo);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
