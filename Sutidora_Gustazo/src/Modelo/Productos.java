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
public class Productos {
private int ID_producto;
private String nomb;
private String preciovent;
private String preciocom;
private String canti;
private Date fechavenci;
private String descrip;

    public Productos(int ID_producto, String nomb, String preciovent, String preciocom, String canti, Date fechavenci, String descrip) {
        this.ID_producto = ID_producto;
        this.nomb = nomb;
        this.preciovent = preciovent;
        this.preciocom = preciocom;
        this.canti = canti;
        this.fechavenci = fechavenci;
        this.descrip = descrip;
        
    }

    public Productos(String nomb, String preciovent, String preciocom, String canti, Date fechavenci, String descrip) {
        this.nomb = nomb;
        this.preciovent = preciovent;
        this.preciocom = preciocom;
        this.canti = canti;
        this.fechavenci = fechavenci;
        this.descrip = descrip;
    }

    public int getID_producto() {
        return ID_producto;
    }

    public void setID_producto(int ID_producto) {
        this.ID_producto = ID_producto;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getPreciovent() {
        return preciovent;
    }

    public void setPreciovent(String preciovent) {
        this.preciovent = preciovent;
    }

    public String getPreciocom() {
        return preciocom;
    }

    public void setPreciocom(String preciocom) {
        this.preciocom = preciocom;
    }

    public String getCanti() {
        return canti;
    }

    public void setCanti(String canti) {
        this.canti = canti;
    }

    public Date getFechavenci() {
        return fechavenci;
    }

    public void setFechavenci(Date fechavenci) {
        this.fechavenci = fechavenci;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
}
