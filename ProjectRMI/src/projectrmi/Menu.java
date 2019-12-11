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
public class Menu {
    public String[] menu;
    public int maxBr;
   // public Food f;
    public Menu(int maxBr)
    {
        this.menu=new String[maxBr];
    }
    public void setMenu(String food)
    {
        for(int i=0;i<maxBr;i++)
            this.menu[i]=food;
    }
   
    
}
