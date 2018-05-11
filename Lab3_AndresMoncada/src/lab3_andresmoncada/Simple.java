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
public class Simple extends Armadura{

    public Simple() {
        hp = 8;
        suerte = 2;
        nombre = "Armadura simple";
        tipo = "usual";
    }

    public int getHp() {
        return hp;
    }

    public int getSuerte() {
        return suerte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Obtuviste la "+nombre +" (" + tipo+") +"+ hp +"HP +"+suerte+"suerte.";
    }
    
}
