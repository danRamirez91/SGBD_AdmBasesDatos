package Clases;

class Rol {
    String id;
    String nombreRol;
    
    //Permisos
    boolean administrador;
    boolean lectura;
    boolean escritura;
    boolean edicion;

    public Rol(String id, String nombreRol, boolean administrador, boolean lectura, boolean escritura, boolean edicion) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.administrador = administrador;
        this.lectura = lectura;
        this.escritura = escritura;
        this.edicion = edicion;
    }

    public String getId() {
        return id;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public boolean isLectura() {
        return lectura;
    }

    public void setLectura(boolean lectura) {
        this.lectura = lectura;
    }

    public boolean isEscritura() {
        return escritura;
    }

    public void setEscritura(boolean escritura) {
        this.escritura = escritura;
    }

    public boolean isEdicion() {
        return edicion;
    }

    public void setEdicion(boolean edicion) {
        this.edicion = edicion;
    }
    
    
}
