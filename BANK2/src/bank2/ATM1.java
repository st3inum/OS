/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IICT (SWE)
 */
public class ATM1 extends Thread {
    customer xx;
    int taka;
    ATM1(customer xx,int tk)
    {
       this.xx=xx;
       this.taka=tk;
    }
    @Override
    public void run()
    {
        try {
            xx.withdraw(this.taka);
        } catch (InterruptedException ex) {
            Logger.getLogger(ATM1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
