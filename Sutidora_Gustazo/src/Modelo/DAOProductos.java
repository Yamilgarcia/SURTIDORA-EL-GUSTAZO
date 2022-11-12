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

    public Productos Insertar(String nomb, float preciovent, float preciocom, float canti, java.sql.Date fechavenci,
            String descrip, int ID_categoria) {
        String transaccion = "INSERT INTO PRODUCTOS VALUES('"
                + nomb + "', '"
                + preciovent + "', '"
                + preciocom + "', '"
                + canti + "', '"
                + fechavenci + "', '"
                + descrip + "', '"
                + ID_categoria + "') ";

        //Llama al metodo actualizar ubicado en la Database.java
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Productos(nomb, preciovent, preciocom, canti, fechavenci, descrip, ID_categoria);
        }
        return null;

    }
    
    public int Actualizar(int ID_producto, String nomb, float preciovent,
            float preciocom, float canti, Date fechavenci, String descrip, int ID_categoria){
        
        
        String transaccion = "UPDATE PRODUCTOS SET  nomb ='"
                +nomb+ "', preciovent='"
                +preciovent+ "', preciocom='"
                +preciocom+ "', canti='"
                +canti+ "', fechavenci='"
                +fechavenci+ "', descrip='"
                +descrip+ "', ID_categoria='"
                +ID_categoria+ "' WHERE id_producto= "
                +ID_producto;
        return new DataBase().Actualizar(transaccion);
    }
    

    //Metodo para actualizar un registro de la BD
    //Metodo para seleccionar todos los registros de la tabla
    public List ObtenerDatos() {
        
        String transaccion = "SELECT *FROM PRODUCTOS";
        //Llama al metodo listar de la DataBase.java

        List<Map> registros = new DataBase().Listar(transaccion);
        List<Productos> productos = new ArrayList();//Arreglo de productos
        //ciclo que recorre cada registro y los agrega al arreglo producto
        for (Map registro : registros) {

            Productos pro = new Productos((int) registro.get("ID_producto"),
                    (String) registro.get("nomb"),
                    (Float.parseFloat(registro.get("preciovent").toString())),
                    (Float.parseFloat(registro.get("preciocom").toString())),
                    (Float.parseFloat(registro.get("canti").toString())),
                    (java.sql.Date) registro.get("fechavenci"),
                    (String) registro.get("descrip"),
                    (int) registro.get("ID_categoria"));

            productos.add(pro);

        }

        return productos;//retorna todos los productos ubicados  en la tabla de la BD
    }

    
    
    
    


    //Metodo para eliminar un registro de la tabla en la BD
    public int Eliminar(int id) {

        String transaccion = "DELETE FROM PRODUCTOS WHERE ID_producto='" + id + "'";

        return new DataBase().Actualizar(transaccion);

    }

}
