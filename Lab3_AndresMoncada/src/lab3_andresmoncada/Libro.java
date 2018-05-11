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
public class Libro extends Arma{

    public Libro() {
        nombre = "Libro de hechizos";
        tipo = "usual";
        ad = 1;
        ap = 5;
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

