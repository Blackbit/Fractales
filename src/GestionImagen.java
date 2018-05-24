
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soib1a25
 */
public class GestionImagen {
    
    public static ArrayList<Imagen> devuelveImagenes()
    {
        ArrayList<Imagen> lista = new ArrayList<>();
        Connection bd = ConexionDatos.getInstance();
        try {
            String vSQL = "SELECT id, x, y, zoom, clase, max_iteraciones from punto_interes";

            Statement st = bd.createStatement();
            ResultSet rs = st.executeQuery(vSQL);

            while (rs.next()) {

                int id = rs.getInt("id");
                String clase = rs.getString("clase");
                double x = rs.getDouble("x");
                double y = rs.getDouble("y");
                double zoom = rs.getDouble("zoom");
                int max_iteraciones = rs.getInt("max_iteraciones");
                
                lista.add(new Imagen(id, clase, x, y, zoom, max_iteraciones));

            }
            
        }catch(Exception e)
        {
            System.out.println(e.toString());
            return null;
        }
        return lista;
    }

    public static boolean crearPuntoInteres(Imagen i)
    {
        Connection bd = ConexionDatos.getInstance();
        String vSQL = "INSERT INTO punto_interes(clase , x, y, zoom, max_iteraciones) VALUES (? , ? , ?, ?, ?)";

        try {
            
            PreparedStatement pst = bd.prepareStatement(vSQL);
            
            pst.setString(1, i.getClase());
            pst.setDouble(2, i.getX());
            pst.setDouble(3, i.getY());
            pst.setDouble(4, i.getZoom());
            pst.setInt(5, i.getMax_iteraciones());

            int n = pst.executeUpdate();
            if (n > 0) {
                return true;
            }
            
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return false;
    }
    
    public static boolean borrarPuntoInteres(int id)
    {
        Connection bd = ConexionDatos.getInstance();

        String vSQL = "DELETE from punto_interes WHERE id = " + id;

        try {
            PreparedStatement pst = bd.prepareStatement(vSQL);

            int n = pst.executeUpdate();
            if (n > 0) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
