/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrmi;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author melid
 */
public class Client {
    public static void main(String args[]) throws RemoteException
    {
        Interface fo;
        String [] nizMenu;
        String [] nizOrder;
        
         try
           {
            fo = (Interface)Naming.lookup("//localhost/burger");
            //FoodOrderInterface fo1 = (FoodOrderInterface)Naming.lookup("//localhost/pizza");
       
            nizMenu=new String[fo.getMenu().length];
            nizMenu=fo.getMenu();
            for(int i=0;i<nizMenu.length;i++){
                 System.out.println(nizMenu[i]);
            }           
             // izabranaPoruzbina();
             int br=2;
             nizOrder=new String[br];
             nizOrder[0]=nizMenu[0];
             nizOrder[1]=nizMenu[1];
             
           
            fo.setOrder("BLA", 0);
          //  fo.setOrder(nizOrder[1],1);
             //String [] f=new String[fo.getOrder().length];
             // f=fo.getOrder();
             //for(int i=0;i<f.length;i++)
              //System.out.println(f[i]);
           
           
          //  fo.getOrder();
            }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
         
    }
}
