/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import java.util.ArrayList;

/**
 *
 * @author jdominguezmartinan
 */
public class Buzon
{
    // no buzon temos un arrayList de correos electronicos 
   ArrayList <Correo> correos=new ArrayList();
   
   public void crearCorreos(){
        correos.add(new Correo("hola",true));
         correos.add(new Correo("adios",false));
   }
        
 
    
    
    public int numeroCorreos()
    {
       int cantidad; // para almacenar o numero de correos electronicos do noso correos
       cantidad=correos.size();
        
       return cantidad;
    }
    public void engade(Correo c) // engadir un correo electronico novo ao noso buzon 
    {
        correos.add(c);
    }
    public boolean porLer() // determinan se temos algun correo no noso buzon por ler 
    {
        boolean pendentes=false;
        for(int i=0;i<correos.size();i++){
            
             if(correos.get(i).getLido()==false)
                 pendentes=true;
        }
        return pendentes;
    }
    public String amosaPrimerNonLeido(){ // amosar primer correo non lido e marcalo como lido 
        String mensaxe=null;
        for(int i=0;i<correos.size();i++){
            if(correos.get(i).getLido()==false){
                mensaxe=correos.get(i).getContido();
                correos.get(i).setLido(true);
            }
        }
        return mensaxe;
    }
    public String amosa(int k) // amosar o correo con subindice k
    {
        String mensaxe;
        mensaxe=correos.get(k-1).getContido();
        return mensaxe;
    }
    public void elimina(int k) // elimina o correo con subindice k
    {
        correos.remove(k-1);
    }
}
