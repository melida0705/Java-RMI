/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrmi;

/**
 *
 * @author melid
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
 import java.rmi.*;
import java.io.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.Scanner;
public class FoodOrderRMI extends UnicastRemoteObject implements Interface{
    
    String [] Food;
    int maxBr=6;
    String [] Order;
    public FoodOrderRMI() throws RemoteException
    {
        super();
       // this.maxBr=maxBr;
        this.Food=new String[this.maxBr];
        this.Order=new String[this.maxBr];
       
    }
  
   
  @Override
 
  
    public void setMenu(String food,int index) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
              
                    Food[index]=food;
                
    }

    @Override
    public String[] getMenu() throws RemoteException {
       
    return Food;
    }
    @Override
   public void setOrder(String food,int index)
   {
      
           Order[index]=food;
       
   }
   @Override
    public String []getOrder()
    {
        
      
       
        return Order;
}
}