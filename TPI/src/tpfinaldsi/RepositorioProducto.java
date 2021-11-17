/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinaldsi;

import java.util.ArrayList;

/**
 *
 * @author Emiliana
 */
public class RepositorioProducto {
    
    public static ArrayList<Producto> ListadoProductos = new ArrayList<Producto>();
    
    //agregar productos a la lista
    public void addProducto(Producto producto){
        ListadoProductos.add(producto);
    }
    
    //obtener listado de productos
    public static ArrayList<Producto> getListadoProductos() {
        return ListadoProductos;
    }
    
    //obtener productos individuales
    public Producto getProducto(String nombreProducto){
        
        for (Producto producto: ListadoProductos)
        {
         if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)){
                return producto;
         }
        }
    return null;
    }
    
    public void mostrarProductos(){
        
        RepositorioProducto.getListadoProductos().forEach(productosDisponibles -> {
            System.out.println("\nID: " + productosDisponibles.getCodigoProducto() + "\nNombre producto: " + productosDisponibles.getNombreProducto() + "\n$" + productosDisponibles.getPrecioProducto() );
        });
    }
}