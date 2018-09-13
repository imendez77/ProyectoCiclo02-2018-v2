package com.dao;

import com.modelo.Rol;
import com.conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Isra Mendez
 */
public class DAORol {
    Conexion db = new Conexion();
    
    public ArrayList<Rol> cmbMostrar()
    {
        ArrayList<Rol> dt = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from rol";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                Rol rol = new Rol();
                rol.setId(rs.getInt("id"));
                rol.setRol(rs.getString("nombre"));
                dt.add(rol);
            }
            con.close();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al Mostrar: "+e.getMessage(), "ERROR", 0);
        }
        finally
        {
            return dt;
        }
    }
}
