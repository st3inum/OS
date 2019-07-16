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
public class customer {
    int balance=100000;
    boolean xx=false;
    public  void  withdraw(int bal) throws InterruptedException
    {
        if(xx) {
            System.out.println(Thread.currentThread().getName()+" system busy ");
            Thread.sleep(20);
            withdraw(bal);
        }
         else {
            this.xx=true;
            if(bal<=this.balance)
            {
                this.balance-=bal;
                System.out.println(Thread.currentThread().getName()+ " withdraw "+bal);
            }
            else
            {
                System.out.println(Thread.currentThread().getName()+ " TAKA NAI");
            }
            System.out.println(Thread.currentThread().getName() +" after withdraw current balance "+this.balance);
            this.xx=false;
        }
    }
    public void print()
    {
        System.out.println("TOT BALANCE"+ this.balance);
    }

}
