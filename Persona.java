import java.time.LocalDate;
/**
 *
 * @author emibe
 */
public class Persona {
    
    private String NombreApellido;
    private String Dni;
    private String Domicilio;
    private String Telefono;
    private String Email;
    private LocalDate autorizFechaInicio;
    private LocalDate autorizFechaFin;
    private Empresa empresa;
   

    // GETTER
    
    public String getNombreApellido() {
        return NombreApellido;
    }

    public int getDni() {
        return Dni;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public LocalDate getautorizFechaInicio() {
        return autorizFechaInicio;
    }

    public LocalDate getautorizFechaFin() {
        return autorizFechaFin;
    }
   
    
    //SETTER

    public void setNombreApellido(String NombreApellido) {
        this.NombreApellido = NombreApellido;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setautorizFechaInicio(LocalDate autorizFechaInicio) {
        this.autorizFechaInicio = autorizFechaInicio;
    }

    public void setFechaFin(LocalDate autorizFechaFin) {
        this.autorizFechaFin = autorizFechaFin;
    }
    
    
    //CONSTRUCTOR

    public Persona(String NombreApellido, String Dni, String Domicilio, String Telefono, String Email, LocalDate autorizFechaInicio, LocalDate autorizFechaFin) {
        this.NombreApellido = NombreApellido;
        this.Dni = Dni;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.Email = Email;
        this.autorizFechaInicio = autorizFechaInicio;
        this.autorizFechaFin = autorizFechaFin;
    }
    
    //METODOS
    
    public void RegistroPersona(){
        
        System.out.println("Ingrese nombre y apellido de la persona: ");
        NombreApellido = System.console().readLine();
        
        System.out.println("\n Ingrese el DNI: ");
        Dni = System.console().readLine();
        
        System.out.println("\n Ingrese domicilio: ");
        Domicilio = System.console().readLine();
        
        System.out.println("Ingrese telefono: ");
        Telefono = System.console().readLine();
        
        System.out.println("Ingrese email: ");
        Email = System.console().readLine();
       
    }
}
