
package com.mycompany.reto5java.modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection conectar = null;
    
    public Connection conectar(){
        try{
            String url = "jdbc:sqlite:ProyectosConstruccion.db";
            conectar = DriverManager.getConnection(url);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
    
}
