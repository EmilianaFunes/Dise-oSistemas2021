
/**
 *
 * @author emibe
 */
public class Cliente {
    
    private String nombre;
    private String empresa;
    private String direccionObra;
    private String email;
    private String telefono;

    
    //Constructor 
    
    public Cliente(String nombre, String empresa, String direccionObra, String email, String telefono) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.direccionObra = direccionObra;
        this.email = email;
        this.telefono = telefono;
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccionObra() {
        return direccionObra;
    }

    public void setDireccionObra(String direccionObra) {
        this.direccionObra = direccionObra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
