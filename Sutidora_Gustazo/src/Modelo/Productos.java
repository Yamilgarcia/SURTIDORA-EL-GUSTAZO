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
private float preciovent;
private float preciocom;
private float canti;
private Date fechavenci;
private String descrip;
private int ID_categoria;

    public Productos(int ID_producto, String nomb, float preciovent, float preciocom, float canti, Date fechavenci, String descrip, int ID_categoria) {
        this.ID_producto = ID_producto;
        this.nomb = nomb;
        this.preciovent = preciovent;
        this.preciocom = preciocom;
        this.canti = canti;
        this.fechavenci = fechavenci;
        this.descrip = descrip;
        this.ID_categoria = ID_categoria;
    }

    public Productos(String nomb, float preciovent, float preciocom, float canti, Date fechavenci, String descrip, int ID_categoria) {
        this.nomb = nomb;
        this.preciovent = preciovent;
        this.preciocom = preciocom;
        this.canti = canti;
        this.fechavenci = fechavenci;
        this.descrip = descrip;
        this.ID_categoria = ID_categoria;
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

    public float getPreciovent() {
        return preciovent;
    }

    public void setPreciovent(float preciovent) {
        this.preciovent = preciovent;
    }

    public float getPreciocom() {
        return preciocom;
    }

    public void setPreciocom(float preciocom) {
        this.preciocom = preciocom;
    }

    public float getCanti() {
        return canti;
    }

    public void setCanti(float canti) {
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

    public int getID_categoria() {
        return ID_categoria;
    }

    public void setID_categoria(int ID_categoria) {
        this.ID_categoria = ID_categoria;
    }




   




    

    


   
}
