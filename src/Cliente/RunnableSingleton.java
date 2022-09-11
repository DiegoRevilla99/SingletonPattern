/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import SingletonClasico.SingletonClasico;

/**
 *
 * @author xeng_
 */
public class RunnableSingleton implements Runnable{

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        SingletonClasico single = SingletonClasico.getInstancia();
        System.out.println("Total de instancias: " + SingletonClasico.getNumIns());
    }
    
}
