/**
 *
 * @author emibe
 */
public class Material {
    
    private String Descripcion;
    private Float precioBolsa;

    
    //Constructor 
    
    public Material(String descripcion, Float precioBolsa) {
        this.Descripcion = descripcion;
        this.precioBolsa = precioBolsa;
    }
   
    //Getter and Setter

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Float getPrecioBolsa() {
        return precioBolsa;
    }

    public void setPrecioBolsa(Float precioBolsa) {
        this.precioBolsa = precioBolsa;
    }
    
    
}
