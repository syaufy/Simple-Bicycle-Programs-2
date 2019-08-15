/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RPL
 */
class SecondMain {
    
    public static void main(String[] args)  {
        Bicycle bike;
        Account acct;
        
        String myName = "Syauqi Zaidan";
        bike = new Bicycle();
        bike.setownerName(myName);
        
        acct = new Account ();
        acct.setownerName(myName);
        acct.setInitialBalance(250.00);
        
        acct.add(25.00);
        acct.deduct(50);
        
        System.out.println(bike.getownerName() + "Owns a bicycle And");
        System.out.println("has $ " + acct.getCurrentBalance()+
                                                "Left in the bank");             
    }
}
