/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Time;
import java.util.*;
/**
 *
 * @author Cris
 */
public class DAOturno {
    
    public Turnos Insertar(String nomb, Time hrainicio,Time hrafinali){
    String transaccion = "INSERT INTO TURNOS VALUES('"
            +nomb+"', '"
            +hrainicio+"','"
            +hrafinali+"')";
    
    if (new DataBase().Actualizar(transaccion)>0){
    
    return new Turnos (nomb,hrainicio,hrafinali);
    }
    return null;
    
    }
    
//    public int actualizar(int ID_categoria,String nomb){
//    
//    String transaccion = "UPDATE TURNO SET nomb='"
//            +nomb+"'WHERE ID_categoria="
//            +ID_categoria;
//    
//    return new DataBase().Actualizar(transaccion);
//    
//    }
    
   public List ObtenerDatos(){
        
        String transaccion ="SELECT * FROM TURNOS";
       
        
        List<Map> registros = new  DataBase().Listar(transaccion);
        List<Turnos> turnos = new ArrayList();
        for (Map registro : registros){
            
            Turnos turn = new Turnos ((int) registro.get("ID_turnos"),(String) registro.get("nomb"), (Time) registro.get("hrainicio"),
                    (Time) registro.get("hrafinali"));
                    
                    
                    turnos.add(turn);
            
        }
        
        return turnos;
    }
    
}

