import java.util.ArrayList;
/**
 *
 * @author emibe
 */
public class RegistroCotizacion {
    
   private ArrayList<Cotizacion> cotizaciones = new ArrayList<Cotizacion>(); 
   
   public void RegistroCotizaciones(Cliente cliente, float precio)
   {
       
       cotizaciones.add(new Cotizacion(cliente, precio));
   }
   
   public void MostrarCotizaciones(){
       
        System.out.println(" ");
        System.out.println("Registro de cotizaciones");
        System.out.println("----------------------------------");
        
        for(Cotizacion cotizacion : cotizaciones){
            
            System.out.println("La cotizacion del usuario " + cotizacion.getCliente().getNombre() + "de la empresa " + cotizacion.getCliente().getEmpresa() + "es de: $" + cotizacion.getPrecio());
        }
   }
}
