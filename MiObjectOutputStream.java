
package Control;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * 
 * @author Pingüi
 */
public class MiObjectOutputStream extends ObjectOutputStream{
    public MiObjectOutputStream (OutputStream out) throws IOException{
        super(out);
    }
    //Constructor sin parámetros
    protected MiObjectOutputStream() throws IOException, SecurityException
    {
        super();
    }
    //Redefinición del método de escribir cabecera para que no haga nada
    protected void writeStreamHeader() throws IOException{}
}
