
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cinthia
 */
public class BaseDatosHelper {
    static public boolean CrearBasedatos()
    {
        Connection bd = ConexionDatos.getInstance();
        try {
            String ins = "CREATE DATABASE fractales";
            PreparedStatement pst2 = bd.prepareStatement(ins);
            pst2.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            if (ex.getErrorCode()!=1007) // Base de datos ya creada
                return false;
        }

        try {
            String ins = "CREATE TABLE IF NOT EXISTS `punto_interes` (`id` int(11) NOT NULL,  `clase` varchar(16) NOT NULL,  `x` double NOT NULL,  `y` double NOT NULL,  `zoom` double NOT NULL,  `max_iteraciones` int(11) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1;";
            PreparedStatement pst2 = bd.prepareStatement(ins);
            pst2.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return false;
        }

        try {
            String ins = "ALTER TABLE `punto_interes` ADD PRIMARY KEY (`id`);";
            PreparedStatement pst2 = bd.prepareStatement(ins);
            pst2.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }

        try {
            String ins = "ALTER TABLE `punto_interes` MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;";
            PreparedStatement pst2 = bd.prepareStatement(ins);
            pst2.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }
        
        return true;
        
    }
}
