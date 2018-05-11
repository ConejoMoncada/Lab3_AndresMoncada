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
public class Mazo extends Arma{

    public Mazo() {
        nombre = "Mazo de hierro";
        tipo = "usual";
        ad = 6;
        ap = 2;
    }

    public int getAd() {
        return ad;
    }

    public int getAp() {
        return ap;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
