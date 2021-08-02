import java.time.LocalTime;
import java.time.LocalDate;
/**
 *
 * @author emibe
 */
public class RegistroIngreso {
    
    private Persona persona;
    private LocalDate fechaDia;
    private LocalTime horaIngreso;
    private LocalTime horaSalida;
    private float temperatura;
    private String patente;
    private String lugarDestino;
    private boolean estadoAutorizacion;
    
    //CONSTRUCTOR

    public RegistroIngreso(Persona persona, LocalDate fechaDia, float temperatura, String patente, String lugarDestino) {
        this.persona = persona;
        this.fechaDia = fechaDia;
        this.temperatura = temperatura;
        this.patente = patente;
        this.lugarDestino = lugarDestino;
    }
    
    //GETTER & SETTER

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public LocalDate getFechaDia() {
        return fechaDia;
    }

    public void setFechaDia(LocalDate fechaDia) {
        this.fechaDia = fechaDia;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public boolean isEstadoAutorizacion() {
        return estadoAutorizacion;
    }

    public void setEstadoAutorizacion(boolean estadoAutorizacion) {
        this.estadoAutorizacion = estadoAutorizacion;
    }
    
    
}
