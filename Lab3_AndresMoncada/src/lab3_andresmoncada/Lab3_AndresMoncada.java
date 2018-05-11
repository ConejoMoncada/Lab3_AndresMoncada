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
            
        }
    }
    static public void juego(int enem, int tam){
        
    }
}
