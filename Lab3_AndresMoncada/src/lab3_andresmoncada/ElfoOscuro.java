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
public class ElfoOscuro extends Enemigo{

    private ArrayList<Arma> armas = new ArrayList();
    private Arma a[] = new Arma[2];
    
    public ElfoOscuro() {
        hp = (int)(Math.random()*60 + 60);
        ad = (int)(Math.random()*20 + 30);
        eficacia = (int)(Math.random()*20 + 50);
        vel = 20;
        crit = (int)(Math.random()*100);
        edad = (int)(Math.random()*200+50);
        nombre = "Elfo Escuro";
        armas.add(new CetroL());
        armas.add(new Libro());
        armas.add(new Legendaria());
        armas.add(new Mazo());
        int r;
        for (int i = 0; i < 2; i++) {
            r = (int)(Math.random()*99 +1);
            if(r == 1)
                a[i] =armas.get(0);
            else if(r <= 50)
                a[i] =armas.get(1);
            else if (r ==  100)
                a[i] =armas.get(2);
            else
                a[i] =armas.get(3);
            ad += a[i].getAd();
        }
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

    public Arma[] getA() {
        return a;
    }
    
}