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
public class Aliado {
    protected int hp;
    protected int ad;
    protected int eficacia;
    protected int suerte;
    protected int vel;
    protected int crit;
    protected String grito;
    protected int edad;
    protected String nombre;
    protected int estatura;
    protected int peso;
    protected String piel;
    protected String raza;
    ArrayList<Objeto> mochila;

    public Aliado() {
    }

    public Aliado(int edad, String nombre, int estatura, int peso, String piel, String raza) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.piel = piel;
        this.raza = raza;
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

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
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

    public String getGrito() {
        return grito;
    }

    public ArrayList<Objeto> getMochila() {
        return mochila;
    }
    
}
