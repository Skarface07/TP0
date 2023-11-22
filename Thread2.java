/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point;

/**
 *
 * @author CHRISTIAN
 */
public class Thread2 implements Runnable {
    private String prenom; 

    public Thread2(String prenom) {
        this.prenom = prenom;
    }
    
    public static void main(String[] args) {
        new Thread1 ("toto").start();
        Thread2 t3 = new Thread2("toto");
        new Thread(t3).start();
        while(true){
            new Thread(new Thread2("jojo")).start();
        }
    }

    @Override
    public void run() {
        System.out.println("bienvenue " +prenom);
    }
        
    }
    

