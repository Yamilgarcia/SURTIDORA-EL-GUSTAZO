/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
/**
 *
 * @author PC
 */
public class Turnos {
    
     private int ID_turno;
    private String nomb;
    private Time hrainicio;
    private Time hrafinali;

    public Turnos(int ID_turno, String nomb, Time hrainicio, Time hrafinali) {
        this.ID_turno = ID_turno;
        this.nomb = nomb;
        this.hrainicio = hrainicio;
        this.hrafinali = hrafinali;
    }

    public Turnos(String nomb, Time hrainicio, Time hrafinali) {
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

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public Time getHrainicio() {
        return hrainicio;
    }

    public void setHrainicio(Time hrainicio) {
        this.hrainicio = hrainicio;
    }

    public Time getHrafinali() {
        return hrafinali;
    }

    public void setHrafinali(Time hrafinali) {
        this.hrafinali = hrafinali;
    }
    
    
}
