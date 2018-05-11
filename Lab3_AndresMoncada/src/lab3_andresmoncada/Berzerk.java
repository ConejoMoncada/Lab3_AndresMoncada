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
public class Berzerk extends Aliado{
    
    public Berzerk(int edad, String nombre, int estatura, int peso, String piel, String raza) {
        super(edad, nombre, estatura, peso, piel, raza);
        hp = 190;
        ad = 80;
        eficacia = 80;
        crit = 30;
        suerte = 15;
        vel = 20;
        grito = ":V";
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

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        this.eficacia = eficacia;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
       this.crit = crit;
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
