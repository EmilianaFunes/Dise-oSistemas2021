/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpfinaldsi;

import java.util.ArrayList;

public class Producto {
    
    int codigoProducto;
    String nombreProducto;
    String descripcion;
    float precioProducto;
    int stock;
    String color;
    Categoria categoria;
    
    ArrayList<Combo> CombosPorProducto = new ArrayList<Combo>();

    public Producto(int codigoProducto, String nombreProducto, String descripcion, float precioProducto, int stock, String color, Categoria categoria) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioProducto = precioProducto;
        this.stock = stock;
        this.color = color;
        this.categoria = categoria;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void addCombo(Combo combo){
        CombosPorProducto.add(combo);
    }
    
    public ArrayList<Combo> getCombosPorProducto(){
        return CombosPorProducto;
    }
}
