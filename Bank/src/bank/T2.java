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
public class T2 extends Thread{
    deposit x;
    T2(deposit x)
    {
        this.x=x;
    }
    @Override
    public void run()
    {
        x.withdraw(500);
    }
}
