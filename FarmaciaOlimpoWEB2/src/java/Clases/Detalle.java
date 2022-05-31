/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jarvi
 */
public class Detalle {
    private String Modificar = "CALL ModificarDetalle(?,?,?,?,?,?)";
    private String Eliminar = "CALL BorrarDetalle(?)";
    private int cantidad;
    private String precio;
    private String descripcion;
    private String total;
    private String cliente;
    private String vistaemple = "select * from detalle";
    private int Columnas = 0;
    private Connection cnn;

     public Detalle() {
         cnn = Conexion.getConexion();
    }
     
     public String getVistaemple() {
        return vistaemple;
    }
     
     public void setVistaemple(String vistaemple) {
        this.vistaemple = vistaemple;
    } 

    public String getModificar() {
        return Modificar;
    }

    public void setModificar(String Modificar) {
        this.Modificar = Modificar;
    }

    public String getEliminar() {
        return Eliminar;
    }

    public void setEliminar(String Eliminar) {
        this.Eliminar = Eliminar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getColumnas() {
        return Columnas;
    }

    public void setColumnas(int Columnas) {
        this.Columnas = Columnas;
    }
     
  
    public DefaultTableModel CargarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            Connection cnn;
            cnn = Conexion.getConexion();
            Statement smt = cnn.createStatement();
            ResultSet rs = smt.executeQuery(getVistaemple());
            ResultSetMetaData md = rs.getMetaData();
            int columnas = md.getColumnCount();
            for (int i = 1; i <= columnas; i++) {
                modelo.addColumn(md.getColumnLabel(i));
            }
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
                fila = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
     
      
       public String NuevoDetalle() {
        String resultado;
        try {
            CallableStatement cmst = cnn.prepareCall("CALL InsertarDetalle(?,?,?,?,?)");  
            cmst.setInt(1,cantidad);
            cmst.setString(2,descripcion);
            cmst.setString(3,precio);
            cmst.setString(4,total);
            cmst.setString(5,cliente);
            cmst.execute();
            resultado = " Los datos se ingresaron exitosamente !!!";
            
        } catch (SQLException sqlex) {
            resultado = " No se realizo la operacion " + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = " No se realizo la operacion " + ex.getMessage();
        }
        return resultado;
    }
       
       
        public String NuevaVenta(int id) {
        String resultado;
        try {
            cnn = Conexion.getConexion();
            CallableStatement cmst = cnn.prepareCall(getEliminar());
            cmst.setInt(1, id);
            cmst.execute();
            resultado = "Los datos se eliminaron correctamente !!!";
            
        } catch (SQLException sqlex) {
            System.out.println(sqlex.getMessage());
            resultado = "No se realizo la operacion" + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = "No se realizo la operacion" + ex.getMessage();
        }
        return resultado;
    }
        
        
        
        
        public String EliminarDatos(int id) {
        String resultado;
        try {
            cnn = Conexion.getConexion();
            CallableStatement cmst = cnn.prepareCall(getEliminar());
            cmst.setInt(1, id);
            cmst.execute();
            resultado = "Los datos se eliminaron correctamente !!!";
            cnn.close();
        } catch (SQLException sqlex) {
            System.out.println(sqlex.getMessage());
            resultado = "No se realizo la operacion" + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = "No se realizo la operacion" + ex.getMessage();
        }
        return resultado;
    }
    
    
}


