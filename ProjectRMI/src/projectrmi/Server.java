/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrmi;

import java.rmi.registry.Registry;

/**
 *
 * @author melid
 */
public class Server {
      public static void main(String args[]){
          
         boolean count=true;
         int state=0;
           try
        {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
         
            FoodOrderRMI rm=new FoodOrderRMI();
           rm.setMenu("burger",0);
           rm.setMenu("pizza",1);
           rm.setMenu("fish",2);
           rm.setMenu("nachos",3);
           rm.setMenu("sushi",4);
           rm.setMenu("fries",5);
           
          
             
           r.rebind("burger", rm);
          
          
            
           
            //r.rebind("pizza", rm1);
            System.out.println("Server je konektovan i moze da se koristi");
           
         
                   
                    
                 
                   
                 
                 
             
               
 
                                  
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }  
          
        
      
      }
}
