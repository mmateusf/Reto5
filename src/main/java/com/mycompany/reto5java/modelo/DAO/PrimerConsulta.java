package com.mycompany.reto5java.modelo.DAO;

import com.mycompany.reto5java.modelo.DAO.Conexion;
import com.mycompany.reto5java.modelo.VO.Lider;


import java.sql.*;


import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;


public class PrimerConsulta {

    public void primerconsulta(DefaultTableModel modelo){
        
        Lider lider = new Lider();
        
        try{
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia from Lider order by Ciudad_residencia");
            
            while(rs.next()){
                lider.setIdLider(rs.getInt(1));
                lider.setNombre(rs.getString(2));
                lider.setPrimerApellido(rs.getString(3));
                lider.setCiudadResidencia(rs.getString(4));
                
                modelo.addRow(new Object[]{lider.getIdLider(), lider.getNombre(), lider.getPrimerApellido(), lider.getCiudadResidencia()});
            }
            rs.close();
            cn.close();
        }
        catch (SQLException ex){
            Logger.getLogger(PrimerConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
