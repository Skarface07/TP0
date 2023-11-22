/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point;

import javax.print.attribute.standard.PresentationDirection;

/**
 *
 * @author CHRISTIAN
 */
public class Thread1 extends Thread{
    private String nom ;
    
   
    public Thread1(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
     public static void main(String[] args) {
        new Thread1("toto").start();
        new Thread1("tutu").start();
        new Thread1("tata").start();
    }

    @Override
    public void run() {
        System.out.println("bienvenue:"+nom);
    }
    
}
