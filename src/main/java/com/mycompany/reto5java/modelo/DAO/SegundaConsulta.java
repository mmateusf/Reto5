/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5java.modelo.DAO;

import com.mycompany.reto5java.modelo.VO.Campestre;
import com.mycompany.reto5java.modelo.VO.Lider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mmate
 */
public class SegundaConsulta {
 public void segundaconsulta(DefaultTableModel modelo){
        
        Campestre campi = new Campestre();
        
        try{
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad  FROM Proyecto WHERE Clasificacion = 'Casa Campestre' AND CIUDAD IN('Santa Marta', 'Cartagena', 'Barranquilla');");
            
            while(rs.next()){
                campi.setId_proyecto(rs.getInt(1));
                campi.setConstructora(rs.getString(2));
                campi.setNumero_habitaciones(rs.getInt(3));
                campi.setCiudad(rs.getString(4));
                
                modelo.addRow(new Object[]{campi.getId_proyecto(), campi.getConstructora(), campi.getNumero_habitaciones(), campi.getCiudad()});
            }
            rs.close();
            cn.close();
        }
        catch (SQLException ex){
            Logger.getLogger(PrimerConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}   

