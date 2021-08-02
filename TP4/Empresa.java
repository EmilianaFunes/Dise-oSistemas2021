import java.util.ArrayList;

/**
 *
 * @author emibe
 */
public class Empresa {
    
    private String RazonSocial;
    private String Cuit;
    private String Domicilio;
    private String Localidad;
    private String Email;
    private int Telefono;
    private static ArrayList<Persona> listaEmpleados = new ArrayList<Persona>();
    private ActividadAutorizada actividad;
    
    //GETTER

    public String getRazonSocial() {
        return RazonSocial;
    }

    public String getCuit() {
        return Cuit;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public String getEmail() {
        return Email;
    }

    public int getTelefono() {
        return Telefono;
    }

    public ArrayList<String> getPersona() {
        return Persona;
    }

    public ActividadAutorizada getActividad() {
        return actividad;
    }
    
        
    
    //SETTER

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public void setCuit(String Cuit) {
        this.Cuit = Cuit;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public void setPersona(ArrayList<String> Persona) {
        this.Persona = Persona;
    }

    public void setActividad(ActividadAutorizada actividad) {
        this.actividad = actividad;
    }
    
    
    //CONSTRUCTOR

    public Empresa(String RazonSocial, String Cuit, String Domicilio, String Localidad, String Email, int Telefono, ActividadAutorizada actividad) {
        this.RazonSocial = RazonSocial;
        this.Cuit = Cuit;
        this.Domicilio = Domicilio;
        this.Localidad = Localidad;
        this.Email = Email;
        this.Telefono = Telefono;
        this.actividad = actividad;
    }
    
    
    
}
