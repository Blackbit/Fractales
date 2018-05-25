
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soib1a25
 */
public class GestionConfiguracion {
    static final String fichero = "config.dat";
    static ConfiguracionFractales cfg = null;
    
    static public void grabar() {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(fichero);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(cfg);
            oout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fout.close();
            } catch (IOException ex) {
                Logger.getLogger(GestionConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    static private void leer()
    {
        FileInputStream fin = null;
        ObjectInputStream oin = null;
        Serializable objeto = null;
        try {
            fin = new FileInputStream(fichero);
            oin = new ObjectInputStream(fin);
            cfg = (ConfiguracionFractales) oin.readObject();
            fin.close();
            oin.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error " + e.toString());
        }
        return;
    }
    
    static ConfiguracionFractales getInstance()
    {
        if (cfg == null)
        {
            leer();
            if (cfg == null) // Si no ha podido leerlo
            {
                cfg = new ConfiguracionFractales();
            }
        }
        return cfg;
    }
}
