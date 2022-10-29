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
public class DAOProveedores {
    
    //Metodo para insertar datos a la base de datos
    
    public Proveedores Insertar(String nomb, String numcelu, String direc ){
        String transaccion = "INSERT INTO Proveedores VALUES('"
                +nomb+"', '"
                +numcelu+"', '"
                +direc+"') '";
                
                
        
        //Llama al metodo actualizar ubicado en la Database.java
        if (new DataBase(). Actualizar(transaccion)>0){
            return new Proveedores (nomb, numcelu,direc);
        }
        return null;
        
        
    }
    //Metodo para actualizar un registro de la BD
    public int Actualizar(String ruc, String nomb, String numcelu, String direc){
        
        String transaccion = "UPDATE PROVEEDORES SET nomb='"
                +nomb+ "',numcelu='"
                +numcelu+"',direc='"
                +direc+"' WHERE ID_empleado="
                +ruc;
        
        return new DataBase().Actualizar(transaccion);
    }
    //Metodo para seleccionar todos los registros de la tabla
    public List ObtenerDatos(){
        
        String transaccion ="SELECT *FROM PROVEEDORES";
        //Llama al metodo listar de la DataBase.java
        
        List<Map> registros = new  DataBase().Listar(transaccion);
        List<Proveedores> proveedores = new ArrayList();//Arreglo de proveedores
        //ciclo que recorre cada registro y los agrega al arreglo proveedores
        for (Map registro : registros){
            
            Proveedores prov = new Proveedores ((String)registro.get("ruc"),
                    (String) registro.get("nomb"),
                    (String) registro.get("numcelu"),
                    (String) registro.get("direc"));
                    
                    
                    
                    proveedores.add(prov);
            
        }
        
        return proveedores;//retorna todos los empelados ubicados  en la tabla de la BD
    }
    //Metodo para eliminar un registro de la tabla en la BD
    public int Eliminar(String ruc){
        
        String transaccion = "DELETE FROM PROVEEDORES WHERE ruc='"+ruc+"'";
        
        return new DataBase().Actualizar(transaccion);
        
    }
    
}
