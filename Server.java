/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

/**
 *
 * @author CHRISTIAN
 */
public class Server {
    
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Démarrage du serveur");
        Socket s = ss.accept();
    
    //lecture de données
        InputStream is = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(is); 
        BufferedReader br = new BufferedReader(isr); 
        
        //Ecriture de données
        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(os,true);
        String IP = s.getRemoteSocketAddress().toString();
        pw.println("bienvenue client IP=" +IP);
        String chaine = br.readLine();
        int n = chaine.length();
        pw.println("la longueur de la chaine est :"+n);
    }
    
}
