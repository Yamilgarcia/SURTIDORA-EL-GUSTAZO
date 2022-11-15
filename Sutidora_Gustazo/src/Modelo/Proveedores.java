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
public class Proveedores {
    private int ID_proveedor;
    private String ruc;
    private String nomb;
    private String numcelu;
    private String direc;

    public Proveedores(int ID_proveedor, String ruc, String nomb, String numcelu, String direc) {
        this.ID_proveedor = ID_proveedor;
        this.ruc = ruc;
        this.nomb = nomb;
        this.numcelu = numcelu;
        this.direc = direc;
    }

    public Proveedores(String ruc, String nomb, String numcelu, String direc) {
        this.ruc = ruc;
        this.nomb = nomb;
        this.numcelu = numcelu;
        this.direc = direc;
    }

    public int getID_proveedor() {
        return ID_proveedor;
    }

    public void setID_proveedor(int ID_proveedor) {
        this.ID_proveedor = ID_proveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getNumcelu() {
        return numcelu;
    }

    public void setNumcelu(String numcelu) {
        this.numcelu = numcelu;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

   
    
    
}
