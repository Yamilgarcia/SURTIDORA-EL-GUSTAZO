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
    private Date fecha;

    public Devoluciones(int ID_devolu, String descrip, Date fecha) {
        this.ID_devolu = ID_devolu;
        this.descrip = descrip;
        this.fecha = fecha;
    }

    public Devoluciones(String descrip, Date fecha) {
        this.descrip = descrip;
        this.fecha = fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
