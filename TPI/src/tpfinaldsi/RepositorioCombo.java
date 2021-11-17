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
public class RepositorioCombo {
    ArrayList<Combo> ListaCombos = new ArrayList<>();
    
    //agregar combo
    public void addCombo(Combo combo){
        ListaCombos.add(combo);
    }
    
    //obtener lista de combos
    public ArrayList<Combo> getListaCombos(){
        return ListaCombos;
    }
    
    //mostrar combos
    public void mostrarCombos(){
        getListaCombos().stream().map(combosDisponibles -> {
            System.out.println("\n");
            return combosDisponibles;
        }).forEachOrdered(combosDisponibles -> {
            System.out.println("ID: " + combosDisponibles.getCodigoCombo() + "\nNombre combo: " + combosDisponibles.getNombreCombo() + "\n$" + combosDisponibles.getPrecioCombo() );
        });
    }
        
    public Combo getCombo (String nombreCombo){
        for (Combo combo: ListaCombos){
            if (combo.getNombreCombo().equalsIgnoreCase(nombreCombo)){
                return combo;
            }
        }
        return null;
    }
    
}
