import java.time.LocalTime;
/**
 *
 * @author emibe
 */
public class ActividadAutorizada {
    
    private String nombreActividad;
    
    
    //GETTER

    public String getNombreActividad() {
        return nombreActividad;
    }
    
    //SETTER

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    
    //CONSTRUCTOR

    public ActividadAutorizada(String nombreActividad) {
        this.nombreActividad = nombreActividad;
        
    }
    
    
}
