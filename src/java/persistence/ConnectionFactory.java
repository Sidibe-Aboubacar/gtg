/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author macbookpro
 */
public class ConnectionFactory {

   //public static final String URL = "jdbc:postgresql://node30316-gtgweb.njs.jelastic.vps-host.net/gtg";
   //public static final String USER = "webadmin";
   //public static final String PASS = "DGKdaa34669";
   
    public static final String URL = "jdbc:postgresql://localhost/gtg";
   public static final String USER = "postgres";
    public static final String PASS = "Allah";

    /**
     * Get a connection to database
     *
     * @return Connection object
     */
    public static Connection getConnection() throws ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.toString());
        }
    }

}
