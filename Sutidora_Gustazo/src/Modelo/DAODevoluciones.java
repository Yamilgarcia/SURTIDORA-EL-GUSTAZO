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
public class DAODevoluciones {
    
    //Metodo para insertar datos a la base de datos
    
    public Devoluciones Insertar(String descrip, Date fecha ){
        String transaccion = "INSERT INTO DEVOLUCIONES VALUES('"
                +descrip+"', '"
                +fecha+"') '";
                
                
        
        //Llama al metodo actualizar ubicado en la Database.java
        if (new DataBase(). Actualizar(transaccion)>0){
            return new Devoluciones (descrip, fecha);
        }
        return null;
        
        
    }
    //Metodo para actualizar un registro de la BD
    public int Actualizar(int ID_devolu, String descrip, Date fecha, int ID_producto){
        
        String transaccion = "UPDATE DEVOLUCIONES SET descrip='"
                +descrip+ "',fecha='"
                +fecha+"',ID_producto='"
                +ID_producto+"' WHERE ID_devolu="
                +ID_devolu;
                
                
                
        
        return new DataBase().Actualizar(transaccion);
    }
    //Metodo para seleccionar todos los registros de la tabla
    public List ObtenerDatos(){
        
        String transaccion ="SELECT *FROM DEVOLUCIONES";
        //Llama al metodo listar de la DataBase.java
        
        List<Map> registros = new  DataBase().Listar(transaccion);
        List<Devoluciones> devoluciones = new ArrayList();//Arreglo de empleados
        //ciclo que recorre cada registro y los agrega al arreglo empleados
        for (Map registro : registros){
            
            Devoluciones devo = new Devoluciones ((int)registro.get("ID_devoluciones"),
                    (String) registro.get("descrip"),
                    (java.sql.Date) registro.get("fecha"),
                    (int) registro.get("ID_producto"));
                    
                    devoluciones.add(devo);
            
        }
        
        return devoluciones;//retorna todos los empelados ubicados  en la tabla de la BD
    }
    //Metodo para eliminar un registro de la tabla en la BD
    public int Eliminar(int id){
        
        String transaccion = "DELETE FROM DEVOLUCIONES WHERE ID_devoluciones='"+id+"'";
        
        return new DataBase().Actualizar(transaccion);
        
    }
    
}
