
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
public class LeeRecurso {
    static String FicheroTexto(String nombreRecurso)
    {
        String resultado = "";
        BufferedReader reader = null;
        try {
            InputStream in = LeeRecurso.class.getResourceAsStream(nombreRecurso);
            reader = new BufferedReader(new InputStreamReader(in));
            while (reader.ready()) {
                resultado += reader.readLine() + "\r\n";
            }
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(LeeRecurso.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return resultado;
    }
}
