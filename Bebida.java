package Hosteleria.model;

public class Bebida extends Consumicion{
    private boolean ConAlcohol;
    private boolean refresco;
    private boolean ConAzucar;
    

    public Bebida(double precio, String nombre, boolean ConAlcohol, boolean refresco, boolean ConAzucar) {
        super(precio, nombre);
        this.ConAlcohol = ConAlcohol;
        this.refresco = refresco;
        this.ConAzucar = ConAzucar;
    }
    
    public boolean getConAlcohol(){
        return ConAlcohol;
    }
    
    public boolean getrefresco(){
        return refresco;
    }
    
    public boolean getConAzucar(){
        return ConAzucar;
    }
}
