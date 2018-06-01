
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
 * @author Blackbit
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
            if (link == null || !link.isValid(0)) {
                
                login = GestionConfiguracion.getInstance().usuario;
                password = GestionConfiguracion.getInstance().clave;
                server = GestionConfiguracion.getInstance().servidor;

                Class.forName("org.gjt.mm.mysql.Driver");
                link = (Connection) DriverManager.getConnection("jdbc:mysql://" + server + "/" + bd, login, password);
                
            }
        } catch (SQLException e) {
            
            if (e.getErrorCode() == 1049) // No existe la base de datos
            {
                int result = JOptionPane.showConfirmDialog(null, "Base de datos inexistente.\n\r¿Desea crearla?", "Error", JOptionPane.INFORMATION_MESSAGE | JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    try {
                        BaseDatosHelper.CrearBasedatos(server, login, password);
                        link = (Connection) DriverManager.getConnection("jdbc:mysql://" + server + "/" + bd, login, password);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Se ha pruducido un error en la creación de la base de datos\n\r" + ex.getLocalizedMessage());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return link;
    }

    public static Connection Test(String url, String login, String password, boolean useDatabase) throws Exception {
        Class.forName("org.gjt.mm.mysql.Driver");
        if (useDatabase)
            return (Connection) DriverManager.getConnection("jdbc:mysql://" + url + "/" + bd, login, password);
        else
            return (Connection) DriverManager.getConnection("jdbc:mysql://" + url + "/", login, password);
    }

}
