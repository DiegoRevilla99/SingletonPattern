/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonClasico;

/**
 *
 * @author xeng_
 */
public class SingletonClasico {
    static SingletonClasico instancia = null;
    private static int numIns = 0;

    SingletonClasico(String tipo) {
        System.out.println("\n Se creó una instancia de " + tipo);
        numIns++;
    }
    
    public int sumar(int x, int y){
        return x+y;
    }

    public static synchronized SingletonClasico getInstancia() {
        if(instancia == null) instancia = new SingletonClasico("SingletonClasico");
        
        return instancia;
    }

    public static int getNumIns() {
        return numIns;
    }

    
    
    
    
    
    
}
