
/**
 *
 * @author emibe
 */
public class Espesor {
    
    private String descripcion;
    private int grosor;
    private float precio;

    //Constructor 
    
    public Espesor(String descripcion, int grosor, float precio) {
        this.descripcion = descripcion;
        this.grosor = grosor;
        this.precio = precio;
    }

    
    //Getter and Setter 
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
