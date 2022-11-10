/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.sql.Time;
import java.util.*;

/**
 *
 * @author Cris
 */
public class DAOClientes {
    public Clientes Insertar(String cedula,String nomb1, String nomb2, String apell1, String apell2, String numcelu, String direc){
    String transaccion = "INSERT INTO CLIENTES VALUES('"
            +cedula+"','"
            +nomb1+"','"
            +nomb2+"','"
            +apell1+"','"
            +apell2+"','"
            +numcelu+"','"
            +direc+"')";
    
    if (new DataBase().Actualizar(transaccion)>0){
    
    return new Clientes (cedula,nomb1,nomb2,apell1,apell2,numcelu,direc);
    }
    return null;
    
    }
    
   public List ObtenerDatos(){
        
        String transaccion ="SELECT * FROM CLIENTES";
       
        
        List<Map> registros = new  DataBase().Listar(transaccion);
        List<Clientes> clientes = new ArrayList();
        for (Map registro : registros){
            
            Clientes cs = new Clientes ((String) registro.get("cedula"),
                    (String) registro.get("nomb1"),(String) registro.get("nomb2"),
                    (String) registro.get("apell1"),(String) registro.get("apell2"),
                    (String) registro.get("numcelu"),(String) registro.get("direc"));
                    
                    
                    clientes.add(cs);
            
        }
        
        return clientes;
    }
    
    
    
    
    
}
