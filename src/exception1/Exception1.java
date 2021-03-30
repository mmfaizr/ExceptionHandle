/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception1;

import java.util.Random;

/**
 *
 * @author Asif
 */
public class Exception1 {

    static void demoproc(){
        try {
            throw new NullPointerException("demo");
        }catch(NullPointerException e){
            System.out.println("caught in demoproc");
            throw e;
        }
    }
    public static void main(String args[]){
        
    try {
        demoproc();
    } catch (NullPointerException e){
        System.out.println("Recaught: "+e);
    }
}
}
