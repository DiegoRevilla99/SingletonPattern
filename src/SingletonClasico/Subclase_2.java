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
public class Subclase_2 extends SingletonClasico{
     private static int numInsSub2 = 0;
    
    private Subclase_2(){
        super("Subclase 2");
        numInsSub2++;
    }
    
    public static SingletonClasico getInstancia() {
        if(instancia == null){
            instancia = new Subclase_2();
        }
        
        return instancia;
    }

    public static int getNumInsSub() {
        return numInsSub2;
    }  
    
}
