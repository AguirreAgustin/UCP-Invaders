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
public class Nave extends Personaje{
    
    
    
    
    public Nave(int pVida,int pVelocidad){
        super(pVida,pVelocidad);
        
        
        
        
        
    }

    

    
    
    
    
    public void destruir(Invasor invasor){
        int vida = invasor.getVida();
        int valor = (this.getVelocidad()* invasor.getVelocidad())/100;
        vida = vida - valor;
        invasor.setVida(vida);
        
    }
    public void destruir(InvasorGhost invasor){
        
    }
    
}
