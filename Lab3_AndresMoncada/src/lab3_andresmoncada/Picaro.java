/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_andresmoncada;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Picaro extends Aliado{
    
    public Picaro(int edad, String nombre, int estatura, int peso, String piel, String raza) {
        super(edad, nombre, estatura, peso, piel, raza);
        maxhp = 150;
        hp = 150;
        ad = 55;
        eficacia = 85;
        crit = 60;
        suerte = 50;
        vel = 15;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(int obj) {
        maxhp += obj;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int obj) {
        ad += obj;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int obj) {
        eficacia += obj;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int obj) {
        suerte += obj;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int obj) {
        vel += obj;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int obj) {
       crit += obj;
    }

    public String getGrito() {
        return grito;
    }

    public int getEdad() {
        return edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public ArrayList<Objeto> getMochila() {
        return mochila;
    }

    public void Conseguir(Objeto o) {
        mochila.add(o);
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public String getPiel() {
        return piel;
    }

    public String getRaza() {
        return raza;
    }
}
