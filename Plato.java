
package Hosteleria.model;

/*
* Plato.java
*
* Creada el 07-mar-2018, 9:53:55
*
* Desarrollada por Rafael en la empresa Aula6J el día 07-mar-2018
*
* Puede contactar conmigo en mail callefalsa123@yahoo.com

/*

/**
 *
 * @author Rafael
 * @version 1.01v
 * @date 07-mar-2018
 */
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
