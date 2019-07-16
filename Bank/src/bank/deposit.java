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
public class deposit{
    int tot_bal=100000;
    public synchronized void withdraw(int bal)
    {
        if(bal<=this.tot_bal)
        {
            this.tot_bal-=bal;
            System.out.println(Thread.currentThread().getName()+ " receive : "+bal);
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+" NO MONEY");
        }
        System.out.println("Current Balance "+this.tot_bal);
    }
    public void print()
    {
        System.out.println(this.tot_bal);
    }
}
