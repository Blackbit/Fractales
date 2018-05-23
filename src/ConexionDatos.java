
import java.sql.Connection;
import java.sql.DriverManager;
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
    static public String login = "root";
    static public String password = "";
    static public String url = "jdbc:mysql://localhost/" + bd;
    static public Connection link = null;
    
    private ConexionDatos() {
    }
    
    public static Connection getInstance() {

        try {
            if (link == null || !link.isValid(0))
            {
                Class.forName("org.gjt.mm.mysql.Driver");
                link = (Connection) DriverManager.getConnection(url, login, password);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return link;
    }
    
}
