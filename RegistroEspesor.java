import java.util.ArrayList;
/**
 *
 * @author emibe
 */
public class RegistroEspesor {
    
    public static ArrayList<Espesor> espesores = new ArrayList<Espesor>();
    
    public void RegistroEspesor(){
        
            espesores.add(new Espesor("Aplicado en Pared 50 mm", 50, 53.60f));
            espesores.add(new Espesor("Aplicado en Pared 70 mm", 70,  87.00f));
            espesores.add(new Espesor("Aplicado en Pared 100 mm", 100, 117.49f));
            espesores.add(new Espesor("Aplicado en Pared 120 mm", 120, 128.48f));
            espesores.add(new Espesor("Aplicado en Pared 160 mm", 160, 143.405f));
            espesores.add(new Espesor("Aplicado en Pared 200 mm", 200, 180.79f));
    }
    
    public void MostrarEspesores(){
        
       int i=0; 
       System.out.println("LISTADO ESPESORES: ");
       
       for (Espesor espesor : espesores){
           i++;
           
           System.out.println( i + "- " + espesor.getDescripcion() + "Aplicacion en pared: " + espesor.getGrosor() + " $" + espesor.getPrecio());
       }
    }
}
