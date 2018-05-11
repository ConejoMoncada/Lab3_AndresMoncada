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
public class Enemigo {
    protected int hp;
    protected int ad;
    protected int eficacia;
    protected int vel;
    protected int crit;
    protected int edad;
    protected String nombre;

    public Enemigo() {
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
}
