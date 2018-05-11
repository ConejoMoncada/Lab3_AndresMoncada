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
public class Ciego extends Talisman{

    public Ciego(){
        nombre = "Talisman del ciego";
        tipo = "inusual";
        vel =0;
        eficacia = -1;
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
    
}
