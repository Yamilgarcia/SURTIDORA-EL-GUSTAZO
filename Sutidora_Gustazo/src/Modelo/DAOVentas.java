/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class DAOVentas {
    
    //Metodo para insertar datos a la base de datos
    
    public Ventas Insertar(Date fecha, String cedula ){
        String transaccion = "INSERT INTO VENTAS VALUES('"
                +fecha+"', '"
                +cedula+"') '";
                
                
        
        //Llama al metodo actualizar ubicado en la Database.java
        if (new DataBase(). Actualizar(transaccion)>0){
            return new Ventas (fecha, cedula);
        }
        return null;
        
        
    }
    //Metodo para actualizar un registro de la BD
    public int Actualizar(int ID_venta, Date fecha, String cedula, int ID_Empleado){
        
        String transaccion = "UPDATE VENTAS SET ID_venta='"
                +ID_venta+ "',fecha='"
                +fecha+"',cedula='"
                +cedula+"' WHERE ID_Empleado="
                +ID_Empleado;
                
                
                
        
        return new DataBase().Actualizar(transaccion);
    }
    //Metodo para seleccionar todos los registros de la tabla
    public List ObtenerDatos(){
        
        String transaccion ="SELECT *FROM VENTAS";
        //Llama al metodo listar de la DataBase.java
        
        List<Map> registros = new  DataBase().Listar(transaccion);
        List<Ventas> ventas = new ArrayList();//Arreglo de proveedores
        //ciclo que recorre cada registro y los agrega al arreglo proveedores
        for (Map registro : registros){
            
            Ventas vent = new Ventas ((int)registro.get("ID_venta"),
                    (java.sql.Date) registro.get("fecha"),
                    (String) registro.get("cedula"),
                    (int) registro.get("ID_empleado"));
                    
                    
                    
                    ventas.add(vent);
            
        }
        
        return ventas;//retorna todos los empelados ubicados  en la tabla de la BD
    }
    //Metodo para eliminar un registro de la tabla en la BD
    public int Eliminar(int id){
        
        String transaccion = "DELETE FROM VENTAS WHERE ID_venta='"+id+"'";
        
        return new DataBase().Actualizar(transaccion);
        
    }
    
}
