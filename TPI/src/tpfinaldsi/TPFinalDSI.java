
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinaldsi;

import java.util.Scanner;

public class TPFinalDSI {

    public static void main(String[] args) {
        
        Scanner sn1 = new Scanner(System.in);
        Scanner sn2 = new Scanner(System.in);
        Scanner sn3 = new Scanner(System.in);
        Scanner sn4 = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        RepositorioProducto repositorioProducto = new RepositorioProducto();
        
        
        Producto Producto1= new Producto(0, "Camionero Aluminio", "Aluminio", 900, 25, "Beige", Categoria.MATES);
        Producto Producto2= new Producto(1, "Torpedo Personalizado", "Personalizado Laser", 1000, 25, "Marrón", Categoria.MATES );
        Producto Producto3= new Producto(2, "Imperial Deluxe", "Patitas de Acero", 1200, 25, "Alpaca", Categoria.MATES );
        Producto Producto4= new Producto(3, "Bombilla Picoloro Ranurada", "Acero inoxidable", 1100, 25, "Plata", Categoria.BOMBILLAS );
        Producto Producto5= new Producto(4, "Bombilla Golf Polo", "Alpaca", 950, 25, "Plata", Categoria.BOMBILLAS );
        Producto Producto6= new Producto(5, "Lata Yerbera", "300gr", 500, 10, "Varios Colores", Categoria.COMPLEMENTOS);
        Producto Producto7= new Producto(6, "Lata Azucarera", "300gr", 500, 10, "Varios Colores", Categoria.COMPLEMENTOS);
        
        repositorioProducto.addProducto(Producto1);
        repositorioProducto.addProducto(Producto2);
        repositorioProducto.addProducto(Producto3);
        repositorioProducto.addProducto(Producto4);
        repositorioProducto.addProducto(Producto5);
        repositorioProducto.addProducto(Producto6);
        repositorioProducto.addProducto(Producto7);
        
       RepositorioCombo repositorioCombo = new RepositorioCombo();
       
       Combo Combo1 = new Combo(0, "Combo Torpedo", "Torpedo Personalizado + Bombilla Picoloro Ranurada", 1990, 3 );
       Combo Combo2 = new Combo(1, "Combo Camionero", "Camionero Aluminio + Bombilla Picoloro Ranurada", 1740, 5 );
       Combo Combo3 = new Combo(2, "Combo Completo", "Imperial Deluxe + Bombilla Picoloro Ranurada + Lata Yerbera + Lata Azucarera", 3100, 8 );
       
       repositorioCombo.addCombo(Combo1);
       repositorioCombo.addCombo(Combo2);
       repositorioCombo.addCombo(Combo3);
       
        while (!salir) {
            
            System.out.println("\t \t \tBIENVENIDO");
            System.out.println("-----------------------------------------------------------");
            System.out.println("1. Mostrar todos los productos");
            System.out.println("2. Mostrar todos los combos");
            System.out.println("3. Mostrar info producto");
            System.out.println("4. Mostrar info combo");
            System.out.println("5. Mostrar producto con sus respectivos combos");
            System.out.println("6. Salir");
            
            System.out.println("\n Ingrese su opción: ");
            opcion = sn1.nextInt();
            
            switch (opcion){
                
                case 1: //list()
                    repositorioProducto.mostrarProductos();
                    
                    break;
                case 2: //listCombo()
                    repositorioCombo.mostrarCombos();
                    
                    break;
                case 3: //mostrarProducto()
                    
                    System.out.println("\n Ingrese nombre del producto a seleccionar: ");
                    String nomProducto = sn2.nextLine();
                    
                    Producto Producto100 = repositorioProducto.getProducto(nomProducto);
                    System.out.println("\nID: " + Producto100.getCodigoProducto() + "\n" + "Nombre Producto seleccionado: " + Producto100.getNombreProducto() + "\n" + Producto100.getDescripcion() + "\n" + "$" + Producto100.getPrecioProducto());
                    break;
                case 4: //mostrarCombo()
                    
                    System.out.println("\nIngrese nombre del combo a seleccionar: ");
                    String nomCombo = sn3.nextLine();
                    
                    Combo combo = repositorioCombo.getCombo(nomCombo);
                    System.out.println("\nNombre Combo: " + combo.getNombreCombo() + "\nDescripción del combo: " + combo.getDescripcionCombo() + "\n" + "$" + combo.getPrecioCombo());
                    break;
                case 5: //visualizar producto con sus combos 
                    
                    System.out.println("\n LISTADO PRODUCTOS: ");
                    
                    repositorioProducto.mostrarProductos();
                    
                    System.out.println("\nIngrese el nombre de un producto que desea ver los combos a los que pertenece: ");
                    String nombreProd = sn4.nextLine();
                    
                    Producto producto = repositorioProducto.getProducto(nombreProd);
                    
                    if (producto == null){
                        
                        System.out.println("\n Nombre de producto no válido");
                        
                    } else { 
                        producto.getCombosPorProducto().forEach(combosDeProducto -> {
                            System.out.println("\n Descripción combo: " + combosDeProducto.getDescripcionCombo() + "\n" + "$" + combosDeProducto.getPrecioCombo());
                });
                    }
                    
                    break;
                    
                case 6: //salir
                    salir = true;
                    break;
                default:
                    System.out.println("\n Las opciones son entre 1 y 6");
            }
            
        } 
    }
    
}
