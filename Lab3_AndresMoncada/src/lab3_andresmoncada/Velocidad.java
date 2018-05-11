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
public class Velocidad extends Talisman{

    public Velocidad(){
        nombre = "Talisman de velocidad";
        tipo = "inusual";
        vel = 3;
        eficacia = 0;
        hp = 0;
        crit = 0;
    }

    public int getHp() {
        return hp;
    }

    public int getVel() {
        return vel;
    }

    public int getEficacia() {
        return eficacia;
    }

    public int getCrit() {
        return crit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Obtuviste el "+nombre +" (" + tipo+") +"+ vel +"velocidad.";
    }
    
}
