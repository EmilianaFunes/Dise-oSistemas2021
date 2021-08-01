import java.util.ArrayList;

/**
 *
 * @author emibe
 */
public class RegistroMaterial {
    
    public static ArrayList <Material> materiales = new ArrayList<Material>();
    
    
    public void RegistroMateriales(){
        
        materiales.add(new Material("Material 1", 15f));
        materiales.add(new Material("Material 2", 20f));
        materiales.add(new Material("Material 3", 25f));
        materiales.add(new Material("Material 4", 30f));
    }
    
    public static void MostrarMateriales(){
        
        int i=0;
        System.out.println("LISTA DE MATERIALES: ");
        
        for (Material material : materiales) {
            i++;
            
            System.out.println(i + "- " + material.getDescripcion() + "$" + material.getPrecioBolsa());
        }
        
    }

}
