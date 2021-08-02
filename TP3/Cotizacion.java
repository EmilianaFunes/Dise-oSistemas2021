
/**
 *
 * @author emibe
 */
public class Cotizacion {
    
    private Cliente cliente;
    private float precio;
    
    public Cotizacion (Cliente cliente) {
        this.cliente = cliente;
        this.precio= 0;
    }

    public Cotizacion(Cliente cliente, float precio) {
        this.cliente = cliente;
        this.precio = precio;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public float Cotizacion (Cliente cliente, Material material, Espesor espesor, float CantM2 ) {
        
        float precioPorBolsa = 0;
        float precioEspesor = 0;
        float precioTotal = 0;
        
        precioPorBolsa = precioPorBolsa (espesor.getGrosor(), CantM2, material.getPrecioBolsa());
        precioEspesor = precioEspesor (CantM2, espesor.getPrecio());
        
        precioTotal = precioPorBolsa + precioEspesor; 
        
        System.out.println("La cotizacion del usuario es: " + "$" + precioTotal);
        
        return precioTotal;
    }
    
    public float precioPorBolsa (int grosor, float m2, float precioPorBolsa) {
        
        float m2PorBolsa = 0;
        int cantBolsas = 0;
        float total = 0;
        
        m2PorBolsa = (grosor * 4.5f) / 100;
        cantBolsas = (int) Math.ceil(m2 / m2PorBolsa);
        total = cantBolsas * precioPorBolsa;
        
        System.out.println("Se necesitaran: " + cantBolsas + " de bolsas para completar " + m2 + "metros cuadrados. El precio por bolsa es de $: " + precioPorBolsa + " , total: $" + total);
        
        return total;
    }
    
    public float precioEspesor (float m2, float precioEspesor) {
        float total = 0;
        
        total = m2 * precioEspesor;
        
        System.out.println("El precio por aplicar material aisalente en " + m2 + " metros cuadrados a un precio por metro cuadrado de $" + precioEspesor + " es de $" + total);

        return total;
    }
}
