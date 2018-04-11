
package Hosteleria.model;


public class Plato {
    private TipoPlato TipoPlato;
    private String ingrediente;
    private int precio;
    private Temperatura Temperatura;
    
    public void plato (String ingrediente, int precio, String tipo){
        this.ingrediente = ingrediente;
        this.precio = precio;
    }
    
    public void getingrediente(){
        this.ingrediente = ingrediente;
    }
    
    public void getprecio(){
        this.precio = precio;
    }
    
    public void gettipo(){
        this.TipoPlato = TipoPlato;
    }
    
    public void gettemperatura(){
        this.Temperatura = Temperatura;
    }
}
