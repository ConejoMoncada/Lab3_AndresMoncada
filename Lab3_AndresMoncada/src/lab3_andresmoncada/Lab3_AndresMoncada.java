/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_andresmoncada;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Lab3_AndresMoncada {

    static Scanner sc = new Scanner(System.in);
    static Aliado p;
    static Enemigo e;
    static ArrayList<Objeto> objetos = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        objetos.add(new Camo());
        objetos.add(new CetroL());
        objetos.add(new Ciego());
        objetos.add(new Com());
        objetos.add(new Libro());
        objetos.add(new Legendaria());
        objetos.add(new Mazo());
        objetos.add(new Simple());
        objetos.add(new Velocidad());
        objetos.add(new Vida());
        sc.useDelimiter("\\n");
        int menu, m2;
        int dif = 1;
        do{
            System.out.println("Dungeons & Dragons");
            System.out.println("1. Iniciar");
            System.out.println("2. Escoger dificultad");
            System.out.println("3. Salir");
            System.out.print("Ingrese una ocpion: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    inicio(dif);
                    break;
                case 2:
                    System.out.println("1. Iniciar");
                    System.out.println("2. Escoger dificultad");
                    System.out.println("3. Salir");
                    System.out.print("Ingrese una ocpion: ");
                    m2 = sc.nextInt();
                    switch(m2){
                        case 1:
                            dif = 1;
                            break;
                        case 2:
                            dif = 2;
                            break;
                        default:
                            dif = 3;
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("No es una opción.");
            }
        }while (menu != 3);
    }
    public static void inicio(int dif){
        sc.useDelimiter("\\n");
        int enem = 0, tam = 0;
        int menu, m2;
        System.out.println("Escoge una clase");
        System.out.println("1. Mago");
        System.out.println("2. Arquero");
        System.out.println("3. Berzerk");
        System.out.println("4. Picaro");
        System.out.print("Ingrese una opcion: ");
        menu = sc.nextInt();
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Estatura (en cm): ");
        int estatura = sc.nextInt();
        System.out.print("Peso: ");
        int peso = sc.nextInt();
        System.out.print("Color de piel: ");
        String color = sc.next();
        System.out.print("Color de pelo: ");
        System.out.println("1. Negro");
        System.out.println("2. Cafe");
        System.out.println("3. Rubio");
        System.out.print("Ingrese una opcion: ");
        m2 = sc.nextInt();
        String pelo="";
        switch(m2){
            case 1:
                pelo = "Negro";
                break;
            case 2:
                pelo = "Cafe";
                break;
            default:
                pelo = "Rubio";
        }
        System.out.print("Raza: ");
        System.out.println("1. Hobbit");
        System.out.println("2. Elfo");
        System.out.println("3. Humano");
        System.out.println("4. Enano");
        System.out.print("Ingrese una opcion: ");
        m2 = sc.nextInt();
        String raza = "";
        switch(m2){
            case 1:
                raza = "Hobbit";
                break;
            case 2:
                raza = "Elfo";
                break;
            case 3:
                raza = "Humano";
                break;
            default:
                raza = "Enano";
        }
        switch(menu){
            case 1:
                p = new Mago(edad,nombre,estatura,peso,color,raza);
                break;
            case 2:
                p = new Arquero(edad,nombre,estatura,peso,color,raza);
                break;
            case 3:
                p = new Berzerk(edad,nombre,estatura,peso,color,raza);
                break;
            default:
                p = new Picaro(edad,nombre,estatura,peso,color,raza);
        }
        switch (dif){
            case 1:
                enem = 5;
                tam = 50;
                break;
            case 2:
                enem = 10;
                tam = 100;
                break;
            default:
                enem = 15;
                tam = 120;
                
        }
        juego(enem,tam);
    }
    static public void juego(int enem, int tam){
        int dado, suerte;
        while(tam > 0 && p.getHp() > 0){
            System.out.println("Presione ENTER para rodar el dado");
            sc.next();
            dado = (int)(Math.random()*20 + 1);
            System.out.println(dado+" pasos");
            tam -= dado;
            suerte = (int)(Math.random()*99+1);
            if (suerte <= p.getSuerte())
                recibeObj();
            else if (suerte <= 95){
                if(enem > 0)
                    combate();
                enem --;
            }
        }
        if(p.getHp()>0)
            System.out.println("Has ganado");
    }
    public static void recibeObj(){
        int elegir = (int)(Math.random()*99+1);
        if (elegir <= 4){
            System.out.println(((Camo)objetos.get(0)));
            p.setHp(((Camo)objetos.get(0)).getHp() + p.getHp());
            p.setSuerte(((Camo)objetos.get(0)).getSuerte() + p.getSuerte());
            p.getMochila().add(objetos.get(0));
        }else if (elegir <= 5){
            System.out.println(((CetroL)objetos.get(1)));
            if (p instanceof Mago)
                ((Mago)p).setAp(((CetroL)objetos.get(1)).getAp()+ ((Mago)p).getAp());
            p.setAd(((CetroL)objetos.get(1)).getAd()+ p.getAd());
            p.getMochila().add(objetos.get(1));
        }else if(elegir <= 9){
            System.out.println(((Ciego)objetos.get(2)));
            p.setEficacia(p.getEficacia() - 5);
            p.getMochila().add(objetos.get(2));
        }else if (elegir <= 10){
            System.out.println(((Com)objetos.get(3)));
            p.setCrit(p.getCrit() + 15);
            p.getMochila().add(objetos.get(3));
        }else if(elegir <= 22){
            System.out.println(((Libro)objetos.get(4)));
            if (p instanceof Mago)
                ((Mago)p).setAp( 40+ ((Mago)p).getAp());
            p.setAd(12 + p.getAd());
            p.getMochila().add(objetos.get(4));
        }else if(elegir <= 23){
            System.out.println(((Legendaria)objetos.get(5)));
            if (p instanceof Mago)
                ((Mago)p).setAp( (-3)+ ((Mago)p).getAp());
            p.setAd(60 + p.getAd());
            p.getMochila().add(objetos.get(5));
        }else if(elegir <= 41){
            System.out.println(((Mazo)objetos.get(6)));
            if (p instanceof Mago)
                ((Mago)p).setAp( 2 + ((Mago)p).getAp());
            p.setAd(6 + p.getAd());
            p.getMochila().add(objetos.get(6));
        }else if(elegir <= 51){
            System.out.println(((Simple)objetos.get(7)));
            p.setHp(8 + p.getHp());
            p.setSuerte(2 + p.getSuerte());
            p.getMochila().add(objetos.get(7));
        }else if(elegir <= 57){
            System.out.println(((Velocidad)objetos.get(8)));
            p.setVel(5 + p.getVel());
            p.getMochila().add(objetos.get(8));
        }else{
            System.out.println(((Vida)objetos.get(9)));
            p.setHp(7 + p.getHp());
            p.getMochila().add(objetos.get(9));
        }
            
    }
    public static void combate(){
        int efic, critico;
        int enem = (int)(Math.random()*4);
        switch(enem){
            case 1:
                e = new Bruja();
                break;
            case 2:
                e = new ElfoOscuro();
                break;
            case 3:
                e = new Troll();
            default:
                e = new Orco();
        }
        System.out.println("Aparece " + e.getNombre());
        int daño = 0;
        while(p.getHp() > 0 && e.getHp() > 0){
            System.out.println("Presione ENTER para efectuar el turno");
            sc.next();
            if(p.getVel() > e.getVel()){
                efic = (int)(Math.random()*99 + 1);
                critico = (int)(Math.random()*99 + 1);
                if(efic <= p.getEficacia()){
                    if(p instanceof Mago){
                        daño = ((Mago)p).getAp() + p.getAd();
                    }
                    else
                        daño = p.getAd();
                    if(critico <= p.getCrit())
                        daño *=2;
                }else
                    daño = 0;
                System.out.println("Ataca "+ p.getNombre() + " por " + daño + " daño.");
                e.setHp(e.getHp() - daño);
                if (e.getHp()> 0){
                    efic = (int)(Math.random()*99 + 1);
                    critico = (int)(Math.random()*99 + 1);
                    if(efic <= e.getEficacia()){
                        if(e instanceof Bruja){
                            daño = ((Bruja)e).getAp() + e.getAd();
                        }
                        else
                            daño = e.getAd();
                        if(critico <= e.getCrit())
                            daño *=2;
                    }else
                        daño = 0;
                    System.out.println("Ataca "+ e.getNombre() + " por " + daño + " daño.");
                    p.setHp(p.getHp() - daño);
                    if(p.getHp()< 0)
                        System.out.println("GAME OVER");
                }else{
                    System.out.println(e.getNombre() + " derrotado/a.");
                    recibeObj();
                }
            }else{
                efic = (int)(Math.random()*99 + 1);
                critico = (int)(Math.random()*99 + 1);
                if(efic <= e.getEficacia()){
                    if(e instanceof Bruja){
                        daño = ((Bruja)e).getAp() + e.getAd();
                    }
                    else
                        daño = e.getAd();
                    if(critico <= e.getCrit())
                        daño *=2;
                }else
                    daño = 0;
                System.out.println("Ataca "+ e.getNombre() + " por " + daño + " daño.");
                p.setHp(p.getHp() - daño);
                if (p.getHp()> 0){
                    efic = (int)(Math.random()*99 + 1);
                    critico = (int)(Math.random()*99 + 1);
                    if(efic <= p.getEficacia()){
                        if(p instanceof Mago){
                            daño = ((Mago)p).getAp() + p.getAd();
                        }
                        else
                            daño = p.getAd();
                        if(critico <= p.getCrit())
                            daño *=2;
                    }else
                        daño = 0;
                    System.out.println("Ataca "+ p.getNombre() + " por " + daño + " daño.");
                    e.setHp(e.getHp() - daño);
                    if(e.getHp()< 0){
                        System.out.println(e.getNombre() + " derrotado/a.");
                        recibeObj();
                    }
                }else
                    System.out.println("GAME OVER");
            }
        }
    }
}
