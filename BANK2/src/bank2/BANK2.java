/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank2;

/**
 *
 * @author IICT (SWE)
 */
public class BANK2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        customer xx=new customer();
        ATM1 a=new ATM1(xx,1000);
        ATM1 b=new ATM1(xx,100);
        ATM1 c=new ATM1(xx,800);
        ATM1 d=new ATM1(xx,2000);
        a.start();
        b.start();
        c.start();
        d.start();
    }
    
}
