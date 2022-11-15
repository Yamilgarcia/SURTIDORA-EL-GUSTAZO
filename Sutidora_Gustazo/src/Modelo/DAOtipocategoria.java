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
public class DAOtipocategoria {
    public Tipocategoria Insertar(String nomb){
    String transaccion = "INSERT INTO TIPOCATEGORIA VALUES('"
            +nomb+"')";
    
    if (new DataBase().Actualizar(transaccion)>0){
    
    return new Tipocategoria (nomb);
    }
    return null;
    
    }
    
    public int actualizar(int ID_categoria,String nomb){
    
    String transaccion = "UPDATE TIPOCATEGORIA SET nomb='"
            +nomb+"'WHERE ID_categoria="
            +ID_categoria;
    
    return new DataBase().Actualizar(transaccion);
    
    }
    
   public List ObtenerDatos(){
        
        String transaccion ="SELECT * FROM TIPOCATEGORIA";
       
        
        List<Map> registros = new  DataBase().Listar(transaccion);
        List<Tipocategoria> categoria = new ArrayList();
        for (Map registro : registros){
            
            Tipocategoria cate = new Tipocategoria ((int) registro.get("ID_categoria"),(String) registro.get("nomb"));
                    
                    
                    categoria.add(cate);
            
        }
        
        return categoria;
    }
    
}
