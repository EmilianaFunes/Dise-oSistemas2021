/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpfinaldsi;

public class Combo {
    
    int codigoCombo;
    String nombreCombo;
    String descripcionCombo;
    float precioCombo;
    int stockCombo;

    public Combo(int codigoCombo, String nombreCombo, String descripcionCombo, float precioCombo, int stockCombo) {
        this.codigoCombo = codigoCombo;
        this.nombreCombo = nombreCombo;
        this.descripcionCombo = descripcionCombo;
        this.precioCombo = precioCombo;
        this.stockCombo = stockCombo;
    }

    public int getCodigoCombo() {
        return codigoCombo;
    }

    public void setCodigoCombo(int codigoCombo) {
        this.codigoCombo = codigoCombo;
    }

    public String getNombreCombo() {
        return nombreCombo;
    }

    public void setNombreCombo(String nombreCombo) {
        this.nombreCombo = nombreCombo;
    }

    public String getDescripcionCombo() {
        return descripcionCombo;
    }

    public void setDescripcionCombo(String descripcionCombo) {
        this.descripcionCombo = descripcionCombo;
    }

    public float getPrecioCombo() {
        return precioCombo;
    }

    public void setPrecioCombo(float precioCombo) {
        this.precioCombo = precioCombo;
    }

    public int getStockCombo() {
        return stockCombo;
    }

    public void setStockCombo(int stockCombo) {
        this.stockCombo = stockCombo;
    }
   
    
    
}
