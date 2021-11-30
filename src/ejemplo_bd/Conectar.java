/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Difo
 */
public class Conectar {

    public Connection conexion() {
        Connection conexion = null;
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "240987");

            System.out.println("Conexion exitosa" + conexion.toString());

        } catch (Exception ex) {
            System.out.println("Error de conexion: " + ex);
        }
        return conexion;
    }

}
