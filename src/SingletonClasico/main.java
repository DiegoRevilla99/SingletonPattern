/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonClasico;

import SingletonClasico.SingletonClasico;

/**
 *
 * @author xeng_
 */
public class main {
    
    public static void main(String[] args) {
        //SingletonClasico p = SingletonClasico.getInstancia();
        //SingletonClasico k = SingletonClasico.getInstancia();

        SingletonClasico sub1 = Subclase_1.getInstancia();
        SingletonClasico sub2 = Subclase_2.getInstancia();
        
        System.out.println(sub1 instanceof Subclase_2);
        System.out.println("Instancias de un singleton: " + SingletonClasico.getNumIns());

        

        //System.out.println(Subclase_1.getNumInsSub());
        
        
    }
    
}
