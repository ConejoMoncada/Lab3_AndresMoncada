/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_andresmoncada;

/**
 *
 * @author Dell
 */
public class Camo extends Armadura{

    public Camo() {
        hp = 8;
        suerte = 2;
        nombre = "Armadura camuflada";
        tipo = "inusual";
    }

    public int getHp() {
        return hp;
    }

    public int getSuerte() {
        return suerte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    
}
