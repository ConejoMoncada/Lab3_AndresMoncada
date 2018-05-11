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
public class ElfoOscuro extends Enemigo{

    public ElfoOscuro() {
        hp = (int)(Math.random()*60 + 60);
        ad = (int)(Math.random()*20 + 30);
        eficacia = (int)(Math.random()*20 + 50);
        vel = 20;
        crit = (int)(Math.random()*100);
        edad = (int)(Math.random()*200+50);
        nombre = "Elfo Escuro";
    }

    public int getEdad() {
        return edad;
    }

    public void setHp(int hp) {
        this.hp = hp;
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