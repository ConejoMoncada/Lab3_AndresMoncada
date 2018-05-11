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
public class Bruja extends Enemigo{
    private int ap;

    public Bruja() {
        ap = (int)(Math.random()*20 + 20);
        hp = (int)(Math.random()*20 + 60);
        ad = (int)(Math.random()*5 + 5);
        eficacia = (int)(Math.random()*20 + 10);
        vel = (int)(Math.random()*2+1);
        crit = 1;
        edad = (int)(Math.random()*70+20);
        nombre = "Bruja";
    }

    public int getEdad() {
        return edad;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public int getHp() {
        return hp;
    }

    public int getAd() {
        return ad;
    }

    public int getEficacia() {
        return eficacia;
    }

    public int getVel() {
        return vel;
    }

    public int getCrit() {
        return crit;
    }

    public String getNombre() {
        return nombre;
    }
    
}
