import java.util.Scanner;
/**
 *
 * @author emibe
 */
public class Principal {

    private static Object registroMaterial;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        RegistroMaterial registroMaterial = new RegistroMaterial();
        RegistroEspesor registroEspesor = new RegistroEspesor();
        RegistroCotizacion registroCotizacion = new RegistroCotizacion();
        RegistroCliente registroCliente = new RegistroCliente();
        Cliente cliente;
        String nombre = " ", empresa = " ", direccionObra = " ", email = " ", telefono = " ";
        int opcion;
        int opcion2;
        int materialNum;
        int espesorNum;
        int respuesta;
        boolean empty = true;
        
        System.out.println("---------INTERFAZ DE COMPRA--------- ");
        
        registroMaterial.RegistroMateriales();
        registroEspesor.RegistroEspesor();
        
        do
        {
            do
            {
                if (empty == true) {
                    empty = false;
                    opcion2 = 1;
                } 
                
                else 
                {
                    System.out.println(" Elija una opcion:" + "\n" + "1-Registrar usuario" + "\n" + "2-Ingresar usuario");
                    opcion2 = input.nextInt();
                }
                
                
                if (opcion2 == 1)
                {
                    System.out.print("Ingrese el nombre del usuario: ");
                    nombre = input.next();
                    System.out.print("Ingrese el nombre de la empresa: ");
                    empresa = input.next();
                    System.out.print("Ingrese el domicilio de la empresa: ");
                    direccionObra = input.next();
                    System.out.print("Ingrese el email del usuario: ");
                    email = input.next();
                    System.out.print("Ingrese el telefono del usuario: ");
                    telefono = input.next();
                } 
                else 
                {
                    
                    boolean login;
                    String email2;
                    
                    do {
                        System.out.print("Ingrese el email del usuario: ");
                        email2 = input.next();
                        login = registroCliente.loginUsuarios(email2);
                        
                        if(login != true)
                        {
                            System.out.println("Email no valido, intentelo nuevamente.");
                        }
                    }
                    
                    while(login != true);
                }
                        if (opcion2 <1 || opcion2 >2)
                {
                    System.out.println("No es una opcion valida. Ingrese la opcion nuevamente.");
                }
                    } while(opcion2 <1 || opcion2 >2);
                    
                    cliente = new Cliente(nombre, empresa, direccionObra, email, telefono);
                    registroCliente.registroClientes(cliente);
                    Cotizacion cotizacion = new Cotizacion(cliente);

                    float precioTotal = 0;
                    float CantM2 = 0;

                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("    Elija una opcion:" + "\n" + "1-Realizar cotizacion estandar" + "\n" + "2-Realizar cotizacion personalizada");
                    System.out.println("----------------------------------------------------------------------------------");

                    do
                    {
                        opcion = input.nextInt();

                         if(opcion < 1 || opcion > 2)
                         {
                            System.out.println("No es una opcion valida. Ingrese la opcion nuevamente.");
                         }
                     }while (opcion < 1 || opcion > 2);
            
            
               if (opcion == 1)
                {
                    RegistroMaterial.MostrarMateriales();

                    do
                    {
                        System.out.println("");
                        System.out.print("Presione el numero del material: ");
                        materialNum = input.nextInt();

                        if(materialNum < 1 || materialNum > RegistroMaterial.materiales.size())
                        {
                            System.out.println("Error de eleccion de material. Ingrese la opcion nuevamente");
                        }

                    }while(materialNum < 1 || materialNum > RegistroMaterial.materiales.size());

                    System.out.println("Ingrese la cantidad de metros cuadrado que desea cubrir: ");
                    CantM2 = input.nextFloat();

                    Material material = RegistroMaterial.materiales.get(materialNum - 1);
                    Espesor espesor = RegistroEspesor.espesores.get(3 - 1);

                    precioTotal = cotizacion.cotizacion(cliente, material, espesor, CantM2);
            }
            else
            {

                RegistroMaterial.MostrarMateriales();

                do
                {
                    System.out.println("");
                    System.out.print("Presione el numero del material: ");
                    materialNum = input.nextInt();

                    if(materialNum < 1 || materialNum > RegistroMaterial.materiales.size())
                    {
                        System.out.println("Error de eleccion de material. Ingrese la opcion nuevamente");
                    }

                }while(materialNum < 1 || materialNum > RegistroMaterial.materiales.size());

                registroEspesor.MostrarEspesores();

                do
                {
                    System.out.println("");
                    System.out.print("Presione el numero de la mano de obra que desea: ");
                    espesorNum = input.nextInt();

                    if (espesorNum < 1 || espesorNum > RegistroEspesor.espesores.size())
                    {
                        System.out.println("Error de eleccion de mano de obra. Ingrese la opcion nuevamente.");
                    }

                }while(espesorNum < 1 || espesorNum > RegistroEspesor.espesores.size());

                System.out.println("Ingrese la cantidad de metros cuadrado que desea cubrir: ");
                CantM2 = input.nextFloat();

                Material material = RegistroMaterial.materiales.get(materialNum - 1);
                Espesor espesores = RegistroEspesor.espesores.get(espesorNum - 1);
                    
                precioTotal = cotizacion.cotizacion(cliente, material, espesor, CantM2);
            }
            
            RegistroCotizacion.registroCotizaciones(cliente, precioTotal);
            
            System.out.println("Quiere realizar otra cotizacion? (1-Si/2-No)");
            do
            {
                respuesta = input.nextInt();
                if(respuesta < 1 || respuesta > 2)
                {
                    System.out.println("Error de eleccion. Ingrese la opcion nuevamente.");
                }
            }while(respuesta < 1 || respuesta > 2);
            
        } while (respuesta != 2);

        registroCotizacion.MostrarCotizaciones();
        }
    }
        
        
        

