/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Time;

/**
 *
 * @author PC
 */
public class Turnos {
    
     private int ID_turnos;
    private String nomb;
    private Time hrainicio;
    private Time hrafinali;

    public Turnos(int ID_turnos, String nomb, Time hrainicio, Time hrafinali) {
        this.ID_turnos = ID_turnos;
        this.nomb = nomb;
        this.hrainicio = hrainicio;
        this.hrafinali = hrafinali;
    }

    public Turnos(String nomb, Time hrainicio, Time hrafinali) {
        this.nomb = nomb;
        this.hrainicio = hrainicio;
        this.hrafinali = hrafinali;
    }

    public int getID_turnos() {
        return ID_turnos;
    }

    public void setID_turnos(int ID_turnos) {
        this.ID_turnos = ID_turnos;
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
        @Override
    public String toString(){
       return ID_turnos + " - " + nomb;
   }
    
}
