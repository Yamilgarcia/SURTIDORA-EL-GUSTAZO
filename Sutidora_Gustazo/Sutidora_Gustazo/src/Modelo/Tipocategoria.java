/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */
public class Tipocategoria {
    private int ID_categoria;
    private String nomb;

    public Tipocategoria(int ID_categoria, String nomb) {
        this.ID_categoria = ID_categoria;
        this.nomb = nomb;
    }

    public Tipocategoria(String nomb) {
        this.nomb = nomb;
    }

    public int getID_categoria() {
        return ID_categoria;
    }

    public void setID_categoria(int ID_categoria) {
        this.ID_categoria = ID_categoria;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }
    
}
