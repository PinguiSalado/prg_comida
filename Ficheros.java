
package Control;

import static Control.Ficheros.listaPlato;
import Model.Menu;
import Model.Plato;
import Model.TipoPlato;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Pingüi
 */
public class Ficheros {
    
    public static ArrayList <Menu> listaMenu = new ArrayList();
    public static ArrayList<Plato> listaPlato = new ArrayList();
    //String ingrediente, int precio, String tipo
    public static void main(String[] args) throws IOException {
        //Menu -> String nombre, double precio, Plato primerPlato, Plato segundoPlato, Bebida bebida, Postre postre
        //plato -> String ingrediente, int precio, String tipo
        //postre -> Temperatura temperatura, Gusto gusto, String ingredientes, double precio, String nombre
        //leerArchivo (menus,listaMenu);
        System.out.println("crear archivo");
        Plato p = new Plato ();
        guardarPlato(p);
        System.out.println(p);
    }
    private static void leerMenu(ArrayList lista){
        try {
            String usr = System.getenv("USERNAME");
            String fichero = "C:\\Users\\"+usr+"\\Documents\\Hosteleria\\Menu\\menu.dat";
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
            System.out.println("creo dat2");
            Object aux = ois.readObject();
            System.out.println("se lee archivo");
            while (aux != null) {
                if (aux instanceof Menu) {
                    System.out.println("leido " + aux.toString());
                }
                lista.add(aux);
                aux = ois.readObject();
            }
            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (Exception e) {
            System.out.println("Error al leer");
        }
    }
    
    private static void leerPlato(ArrayList lista){
        try {
            String usr = System.getenv("USERNAME");
            //Revisar path para cada ordenador
            String fichero = "C:\\Users\\"+usr+"\\Documents\\Hosteleria\\Menu\\menu.dat";
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
            System.out.println("creo dat2");
            Object aux = ois.readObject();
            System.out.println("se lee archivo");
            while (aux != null) {
                if (aux instanceof Menu) {
                    System.out.println("leido " + aux.toString());
                }
                lista.add(aux); 
                aux = ois.readObject();
            }
            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (Exception e) {
            System.out.println("Error al leer");
        }
    }
        public static void guardarMenu(ArrayList lista, Menu m) throws IOException {
        lista.add(m);
        String usr = System.getenv("USERNAME");
        String fichero = "C:\\Users\\"+usr+"\\Documents\\Hosteleria\\Menu\\menu.dat";
        FileWriter file;
        BufferedWriter filtro;
        File f = new File(fichero);

        try {
            if (f.exists()) {//Si existe escribo sin cabecera
                MiObjectOutputStream oos = new MiObjectOutputStream (new FileOutputStream (fichero, true));
                oos.writeObject(m);
                System.out.println("Guardando..."+m.toString());
                oos.close();
            }else { //si no le añado a cabecera delante con el ObjectOutputStream
                ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream (fichero, true));
                oos.writeObject(m);
                System.out.println("Guardando..."+m.toString());
                oos.close();
            }
        } catch (Exception e) {
            System.out.println("Error de escritura");
            System.out.println(e.getMessage());
        } finally {
        }
    }
        
        //Falta probar
        public static void guardarPlato(Plato p) throws IOException {
            //Plato
            String usr = System.getenv("USERNAME");
            //Cuando este creado 
            listaPlato.add(p);
            String fichero = "C:\\Users\\" + usr + "\\Documents\\Hosteleria\\Menu\\plato.dat";
            FileWriter file;
            BufferedWriter filtro;
            File f = new File(fichero);

        try {
            if (f.exists()) {//Si existe escribo sin cabecera
                MiObjectOutputStream oos = new MiObjectOutputStream (new FileOutputStream (fichero, true));
                oos.writeObject(p);
                System.out.println("Guardando..."+p.toString());
                oos.close();
            }else { //si no le añado a cabecera delante con el ObjectOutputStream
                ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream (fichero, true));
                oos.writeObject(p);
                System.out.println("Guardando..."+p.toString());
                oos.close();
            }
        } catch (Exception e) {
            System.out.println("Error de escritura");
            System.out.println(e.getMessage());
        } finally {
        }
    }
}
