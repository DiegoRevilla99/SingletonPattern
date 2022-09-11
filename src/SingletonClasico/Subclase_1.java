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
public class Subclase_1 extends SingletonClasico{
    //private static Subclase_1 instancia_sub1 = null;
    private static int numInsSub1 = 0;
    
    private Subclase_1(){
        super("Subclase 1");
        numInsSub1++;
    }
    
    public static SingletonClasico getInstancia() {
        if(instancia == null){
            instancia = new Subclase_1();
        }
        
        return instancia;
    }

    public static int getNumInsSub1() {
        return numInsSub1;
    }   
    
}
