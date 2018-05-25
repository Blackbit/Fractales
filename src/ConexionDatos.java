
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soib1a25
 */
public class ConexionDatos {
    static public String bd = "fractales";
    static public String login; 
    static public String password; 
    static public String server; 
    static public Connection link = null;
    
    private ConexionDatos() {
    }
    
    public static Connection getInstance() {

        try {
            if (link == null || !link.isValid(0))
            {
                login = GestionConfiguracion.getInstance().usuario;
                password = GestionConfiguracion.getInstance().clave;
                server = GestionConfiguracion.getInstance().servidor;
                
                Class.forName("org.gjt.mm.mysql.Driver");
                link = (Connection) DriverManager.getConnection("jdbc:mysql://"+server+"/" + bd, login, password);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return link;
    }

    public static Connection Test(String url, String login, String password) throws Exception {
        Class.forName("org.gjt.mm.mysql.Driver");
        return (Connection) DriverManager.getConnection("jdbc:mysql://"+url+"/" + bd, login, password);
    }
    
}
