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
public class DAOEmpleado {
    
    //Metodo para insertar datos a la base de datos
    
    public Empleados Insertar(String nomb1, String nomb2, String apell1, String apell2, String numcelu, String direc ){
        String transaccion = "INSERT INTO EMPLEADOS VALUES('"
                +nomb1+"', '"
                +nomb2+"', '"
                +apell1+"', '"
                +apell2+"', '"
                +numcelu+"', '"
                +direc+"') '";
        
        //Llama al metodo actualizar ubicado en la Database.java
        if (new DataBase(). Actualizar(transaccion)>0){
            return new Empleados (nomb1, nomb2,apell1,apell2,numcelu,direc);
        }
        return null;
        
        
    }
    //Metodo para actualizar un registro de la BD
    public int Actualizar(int ID_empleado, String nomb1, String nomb2, String apell1, String apell2, String numcelu, String direc){
        
        String transaccion = "UPDATE EMPLEADOS SET nomb1='"
                +nomb1+ "',nomb2='"
                +nomb2+"',apell1='"
                +apell1+"',apell2='"
                +apell2+"',numcelu='"
                +numcelu+"',direc='"
                +direc+"' WHERE ID_empleado="
                +ID_empleado;
        
        return new DataBase().Actualizar(transaccion);
    }
    //Metodo para seleccionar todos los registros de la tabla
    public List ObtenerDatos(){
        
        String transaccion ="SELECT *FROM EMPLEADOS";
        //Llama al metodo listar de la DataBase.java
        
        List<Map> registros = new  DataBase().Listar(transaccion);
        List<Empleados> empleados = new ArrayList();//Arreglo de empleados
        //ciclo que recorre cada registro y los agrega al arreglo empleado
        for (Map registro : registros){
            
            Empleados emp = new Empleados((int)registro.get("ID_empleado"),
                    (String) registro.get("nomb1"),
                    (String) registro.get("nomb2"),
                    (String) registro.get("apell1"),
                    (String) registro.get("apell2"),
                    (String) registro.get("numcelu"),
                    (String) registro.get("direc"));
                    
                    empleados.add(emp);
            
        }
        
        return empleados;//retorna todos los empelados ubicados  en la tabla de la BD
    }
    //Metodo para eliminar un registro de la tabla en la BD
    public int Eliminar(int id){
        
        String transaccion = "DELETE FROM EMPLEADOS WHERE ID_empleado='"+id+"'";
        
        return new DataBase().Actualizar(transaccion);
        
    }
    
}
