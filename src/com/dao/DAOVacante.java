package com.dao;

import com.modelo.Operaciones;
import com.conexion.Conexion;
import com.modelo.Usuario;
import com.modelo.Vacante;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Escanor
 */
public class DAOVacante implements Operaciones {

    Conexion db = new Conexion();
    Vacante va = new Vacante();

    @Override
    public boolean insertar(Object obj) {
        va = (Vacante) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into vacante(id_empresa,puesto,area,tipo_contrato,exp_requerida,genero_requerido,edad_requerida,salario,vehiculo_requerido,ciudad,descripcion,fecha_creacion,fecha_modif,estado) values (?, ?, ?, ?, ?, ?,?,?,?,?,?,?,now(),'',?)";

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);

            pst.setInt(1, va.getId_empresa());
            pst.setString(2, va.getPuesto());
            pst.setString(3, va.getArea());
            pst.setString(4, va.getTipo_contrato());
            pst.setString(5, va.getExp_requerida());
            pst.setString(6, va.getGenero_requerido());
            pst.setInt(7, va.getEdad_requerida());
            pst.setDouble(8, va.getSalario());
            pst.setString(9, va.getVehiculo_requerido());
            pst.setString(10, va.getCiudad());
            pst.setString(11, va.getDescripcion());            
            pst.setInt(12, 1);

            int row = pst.executeUpdate();

            if (row > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar: " + e.getMessage(), "ERROR", 0);
            return false;
        }
    }

    @Override
    public boolean modificar(Object obj) {
        va = (Vacante) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update vacante set  puesto=?, area=?, tipo_contrato=?, exp_requerida= ?,genero_requerido=?,edad_requerida=?,salario=?,vehiculo_requerido=?,ciudad=?,descripcion=?,fecha_modif=now(),id_empresa where id=?";

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);

            pst.setString(1, va.getPuesto());
            pst.setString(2, va.getArea());
            pst.setString(3, va.getTipo_contrato());
            pst.setString(4, va.getExp_requerida());
            pst.setString(5, va.getGenero_requerido());
            pst.setInt(6, va.getEdad_requerida());
            pst.setDouble(7, va.getSalario());
            pst.setString(8, va.getVehiculo_requerido());
            pst.setString(9, va.getCiudad());
            pst.setString(10, va.getDescripcion());
            pst.setInt(11, va.getEstado());
            pst.setInt(12, va.getId_empresa());
            int row = pst.executeUpdate();

            if (row > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar: " + e.getMessage(), "ERROR", 0);
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        va = (Vacante) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update vacante set estado=0 where id_user = ?";

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);

            pst.setInt(1, va.getId());

            int row = pst.executeUpdate();

            if (row > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar: " + e.getMessage(), "ERROR", 0);
            return false;
        }
    }

    @Override
    public ArrayList<Object[]> mostrar() {
        ArrayList<Object[]> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select va.id, em.nombre,puesto,area,tipo_contrato, exp_requerida,genero_requerido, "
                + "edad_requerida,salario,vehiculo_requerido,va.ciudad,va.descripcion,va.estado "
                + "from vacante va inner join empresa em "
                + "on va.id_empresa = em.id_empresa ;";

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                Object[] rows = new Object[13];
                for (int i = 0; i <= 12; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                datos.add(rows);
            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al Mostrar: " + e.getMessage(), "ERROR", 0);
        } finally {
            return datos;
        }
    }

}
