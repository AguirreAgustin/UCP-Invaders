/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucpinvaders;

/**
 *
 * @author Agustin
 */
public class Asteroide {
    private int velocidad;
    
    public Asteroide(int pVelocidad){
        
        this.setVelocidad(pVelocidad);
        
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void chocarNave(Nave pNave){
        pNave.setVida(0);
    
    }
    
    public void chocarInvasor(Nave pNave){
        pNave.setVida(0);
    
    }
    
}
