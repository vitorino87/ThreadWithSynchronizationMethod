/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadwithsynchronizationmethod;

/**
 *
 * @author tiago.lucas
 */
public class Shared {
    synchronized void justDolt(String s)
    {
        System.out.println("Starting ::: "+s);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println("Ending ::: "+s);
    }
    
}
