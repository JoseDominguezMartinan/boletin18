/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

/**
 *
 * @author jdominguezmartinan
 */
public class Correo
{
    private String contido; // parametro para indicar o contido dun correo 
    private boolean lido; // parametro para indicar se o correo esta lido (true) ou non lido (false)

    public Correo(String contido,boolean lido)
    {
        this.contido = contido;
        this.lido = lido;
    }

    

    public String getContido()
    {
        return contido;
    }

    public void setContido(String contido)
    {
        this.contido = contido;
    }

    public boolean getLido()
    {
        return lido;
    }

    public void setLido(boolean lido)
    {
        this.lido = lido;
    }
    
}
