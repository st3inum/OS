/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author IICT (SWE)
 */



public class Bank {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        deposit x=new deposit();
        T1 a=new T1(x);
        T2 b=new T2(x);
        T3 c=new T3(x);
        T4 d=new T4(x);
        a.start();
        b.start();
        c.start();
        d.start();
//        a.join();
//        b.join();
//        c.join();
//        d.join();
//        x.print();
    }
    
}
