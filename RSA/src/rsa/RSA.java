/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

/**
 *
 * @author Geo
 */
public class RSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Algo a = new Algo(17, 23, 3);
        String msg = "maca";
        a.encriptar(3, a.convercao(msg.toCharArray()));
        //a.decriptar();
    }
    
}
