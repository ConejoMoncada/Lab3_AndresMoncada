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
public class Orco extends Enemigo{

    public Orco() {
        hp = (int)(Math.random()*20 + 70);
        ad = (int)(Math.random()*15 + 30);
        eficacia = (int)(Math.random()*50 + 20);
        vel = 20;
        crit = 60;
        edad = (int)(Math.random()*25+30);
        nombre = "Orco";
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