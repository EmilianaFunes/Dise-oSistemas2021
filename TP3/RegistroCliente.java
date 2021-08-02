import java.util.ArrayList;
/**
 *
 * @author emibe
 */
public class RegistroCliente {
    
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public void RegistroClientes(Cliente cliente) {
        
        clientes.add(cliente);
    }
    
    public boolean loginUsuarios(String email) {
        
        boolean flag = false;
        
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().compareTo(email)==0) {
                flag = true; 
                break;
            } else {
                flag = false;
            }
        }
        
        return flag;
    }
    
}
