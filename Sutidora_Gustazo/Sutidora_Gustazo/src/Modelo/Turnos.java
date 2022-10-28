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
public class Turnos {
    
    private int ID_turno;
    private char nomb;
    private Date hrainicio;
    private Date hrafinali;

    public Turnos(int ID_turno, char nomb, Date hrainicio, Date hrafinali) {
        this.ID_turno = ID_turno;
        this.nomb = nomb;
        this.hrainicio = hrainicio;
        this.hrafinali = hrafinali;
    }

    public Turnos(char nomb, Date hrainicio, Date hrafinali) {
        this.nomb = nomb;
        this.hrainicio = hrainicio;
        this.hrafinali = hrafinali;
    }

    public int getID_turno() {
        return ID_turno;
    }

    public void setID_turno(int ID_turno) {
        this.ID_turno = ID_turno;
    }

    public char getNomb() {
        return nomb;
    }

    public void setNomb(char nomb) {
        this.nomb = nomb;
    }

    public Date getHrainicio() {
        return hrainicio;
    }

    public void setHrainicio(Date hrainicio) {
        this.hrainicio = hrainicio;
    }

    public Date getHrafinali() {
        return hrafinali;
    }

    public void setHrafinali(Date hrafinali) {
        this.hrafinali = hrafinali;
    }
    
}
