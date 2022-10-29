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
public class DAOProductos {
    //Metodo para insertar datos a la base de datos
    
    public Productos Insertar(String nomb, String preciovent, String preciocom, String canti, Date fechavenci, String descrip ){
        String transaccion = "INSERT INTO PRODUCTOS VALUES('"
                +nomb+"', '"
                +preciovent+"', '"
                +preciocom+"', '"
                +canti+"', '"
                +fechavenci+"', '"
                +descrip+"') '";
        
        //Llama al metodo actualizar ubicado en la Database.java
        if (new DataBase(). Actualizar(transaccion)>0){
            return new Productos (nomb, preciovent,preciocom,canti,fechavenci,descrip);
        }
        return null;
        
        
    }
    //Metodo para actualizar un registro de la BD
    public int Actualizar(int ID_producto, String nomb, String preciovent, String preciocom, String canti, Date fechavenci, String descrip){
        
        String transaccion = "UPDATE PRODUCTOS SET nomb='"
                +nomb+ "',preciovent='"
                +preciovent+"',preciocom='"
                +preciocom+"',canti='"
                +canti+"',fechavenci='"
                +fechavenci+"',descrip='"
                +descrip+"' WHERE ID_productos="
                +ID_producto;
        
        return new DataBase().Actualizar(transaccion);
    }
    //Metodo para seleccionar todos los registros de la tabla
    public List ObtenerDatos(){
        
        String transaccion ="SELECT *FROM PRODUCTOS";
        //Llama al metodo listar de la DataBase.java
        
        List<Map> registros = new  DataBase().Listar(transaccion);
        List<Productos> productos = new ArrayList();//Arreglo de productos
        //ciclo que recorre cada registro y los agrega al arreglo producto
        for (Map registro : registros){
            
            Productos pro = new Productos ((int)registro.get("ID_producto"),
                    (String) registro.get("nomb"),
                    (String) registro.get("preciovent"),
                    (String) registro.get("preciocom"),
                    (String) registro.get("canti"),
                    (java.sql.Date) registro.get("fechavenci"),
                    (String) registro.get("descrip"));
                    
                    productos.add(pro);
            
        }
        
        return productos;//retorna todos los empelados ubicados  en la tabla de la BD
    }
    //Metodo para eliminar un registro de la tabla en la BD
    public int Eliminar(int id){
        
        String transaccion = "DELETE FROM PRODUCTOS WHERE ID_producto='"+id+"'";
        
        return new DataBase().Actualizar(transaccion);
        
    }
    
    
}
