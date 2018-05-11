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
public class CetroL extends Arma{

    public CetroL() {
        nombre = "el Cetro de poder supremo";
        tipo = "raro";
        ad = 12;
        ap = 40;
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

    @Override
    public String toString() {
        return "Obtuviste "+nombre +" (" + tipo+") +"+ ad +"AD +"+ap+"AP.";
    }
    
    
}
