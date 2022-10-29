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
public class Ventas {
    
    private int ID_venta;
    private Date fecha;
    private String cedula;
    private int ID_Empleado;

    public Ventas(int ID_venta, Date fecha, String cedula, int ID_Empleado) {
        this.ID_venta = ID_venta;
        this.fecha = fecha;
        this.cedula = cedula;
        this.ID_Empleado = ID_Empleado;
    }

    public Ventas(Date fecha, String cedula) {
        this.fecha = fecha;
        this.cedula = cedula;
    }

    public int getID_venta() {
        return ID_venta;
    }

    public void setID_venta(int ID_venta) {
        this.ID_venta = ID_venta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }
    
}
