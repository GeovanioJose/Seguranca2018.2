/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import static java.lang.Math.pow;
import java.util.Arrays;
import java.math.BigInteger;

/**
 *
 * @author Geo
 */
public class Algo {
    private int p, q;
    private int e, d;
    private final int n;
    private int phi_n;
    private int[] txt_ascii;
    private int[] encriptado;
    private int[] decriptado;

    public Algo(int p, int q, int e) {
        this.p = p;
        this.q = q;
        this.e = e;
        this.phi_n =(p-1)*(q-1); 
        this.n =p*q;
    }
        
    public int[] convercao(char[] txt){
        txt_ascii = new int[txt.length];
                
        for(int i = 0; i < txt.length; i++){
            txt_ascii[i] =(int) txt[i];
        }
        return txt_ascii;
    }
    
    public int [] encriptar(int e, int[] convertido){
        encriptado = new int[convertido.length];
        for(int i =0; i<convertido.length; i ++){
            encriptado[i] = (int) pow(convertido[i], e) % n; 
        }
        System.out.print(Arrays.toString(encriptado));
        decriptar();
        return encriptado;
    }
    
    public void decriptar(){
        decriptado = new int[encriptado.length];
        d = inversoMultiplicativo();
        System.out.print(d);
        for(int i =0; i<encriptado.length; i ++){
            decriptado[i] = (int) pow(encriptado[i], d) % n; 
        }
        System.out.print(Arrays.toString(decriptado));
    }
    
    public int inversoMultiplicativo(){
        for(int i=0; i < phi_n; i++){
            if((e*i)%phi_n == 1){
                System.out.print(i);
                return i;
            }    
        }
        return -1;
    }
}
