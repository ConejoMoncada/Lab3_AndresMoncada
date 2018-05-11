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
public class Legendaria extends Arma{

    public Legendaria() {
        nombre = "Espada legendaria";
        tipo = "raro";
        ad = 60;
        ap = -3;
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
