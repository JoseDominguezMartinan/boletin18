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
public class Boletin18
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        // probas, primeiro creamos un obxeto de tipo correos
         
     
    
        Buzon buzonDeEntrada=new Buzon();
       
       
      
        //mostramos a cantidade de correos que temos no correos 
        buzonDeEntrada.crearCorreos();
       System.out.println(buzonDeEntrada.numeroCorreos()); // visualizamos o numero de correos da bandexa 
       Correo correo3=new Correo("ei",false); // engadimos un correo ao buzon 
       buzonDeEntrada.engade(correo3);
       // vemos se temos algun correo por ler, true o false 
        System.out.println(buzonDeEntrada.porLer());
        // lemos o primeiro non lido e o marcamos como lido
        System.out.println(buzonDeEntrada.amosaPrimerNonLeido());
        // amosar correo con subindice determinado
        System.out.println(buzonDeEntrada.amosa(0));
        // elimina o correo con subindice determinado
        buzonDeEntrada.elimina(0);
        System.out.println(buzonDeEntrada.amosa(0));// para comprobar que o eliminase , ten que mostrar con este subindice o que antes estaba como 1 
        
        
    }
    
}
