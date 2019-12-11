/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
 import java.rmi.*;
import java.rmi.server.*;
/**
/**
 *
 * @author melid
 */
public interface Interface extends Remote {
  //  public Food setFood() throws RemoteException;
    public void setMenu(String food,int index) throws RemoteException;
    public String []getMenu() throws RemoteException;
    public String []getOrder() throws RemoteException;
    public void setOrder(String food,int br) throws RemoteException;
}
