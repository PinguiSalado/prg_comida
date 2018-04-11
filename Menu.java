
package Hosteleria.model;

public class Menu {

    private String nombre;
    private double precio
    private Plato primerPlato;
    private Plato segundoPlato;
    private Bebida bebida;
    private Postre postre;
  
    public Menu(String nombre, double precio, Plato primerPlato, Plato segundoPlato, Bebida bebida, Postre postre) {
        this.nombre = nombre;
        this.precio = precio;
        this.primerPlato = primerPlato;
        this.segundoPlato = segundoPlato;
        this.bebida = bebida;
        this.postre = postre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Plato getPrimerPlato() {
        return primerPlato;
    }

    public Plato getSegundoPlato() {
        return segundoPlato;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public Postre getPostre() {
        return postre;
    }
  
  
}
