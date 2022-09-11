/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author xeng_
 */
public class PruebaHilos {
    
    public static void main(String[] args) {
        
        Thread hilo1 = new Thread(new RunnableSingleton());
        Thread hilo2 = new Thread(new RunnableSingleton());
        Thread hilo3 = new Thread(new RunnableSingleton());
        
        
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        
    }
    
}
