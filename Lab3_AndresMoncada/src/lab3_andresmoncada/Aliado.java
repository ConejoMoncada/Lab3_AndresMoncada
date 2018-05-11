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
    protected int maxhp;
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
    
}
