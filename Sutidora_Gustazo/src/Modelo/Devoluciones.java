/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date;

/**
 *
 * @author PC
 */
public class Devoluciones {
    private int ID_devolu;
    private String descrip;
    private float canti;
    private Date fecha;
    private int ID_producto;

    public Devoluciones(int ID_devolu, String descrip, float canti, Date fecha, int ID_producto) {
        this.ID_devolu = ID_devolu;
        this.descrip = descrip;
        this.canti = canti;
        this.fecha = fecha;
        this.ID_producto = ID_producto;
    }

    public Devoluciones(String descrip, float canti, Date fecha, int ID_producto) {
        this.descrip = descrip;
        this.canti = canti;
        this.fecha = fecha;
        this.ID_producto = ID_producto;
    }

    public int getID_devolu() {
        return ID_devolu;
    }

    public void setID_devolu(int ID_devolu) {
        this.ID_devolu = ID_devolu;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public float getCanti() {
        return canti;
    }

    public void setCanti(float canti) {
        this.canti = canti;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getID_producto() {
        return ID_producto;
    }

    public void setID_producto(int ID_producto) {
        this.ID_producto = ID_producto;
    }
       
   
    
   

    
    
}
