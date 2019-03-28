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
public class InvasorGhost extends Personaje{
    
    public InvasorGhost(int pVida,int pVelocidad){
    
        super(pVida,pVelocidad);
        
        
    }

    
    public void chocarNave(Nave pNave){
        
    }
    public void destruirNave(Nave pNave){
        
        int vida = pNave.getVida();
        
        int valor = (this.getVelocidad()*20)/100;
        vida = vida - valor;
        pNave.setVida(vida);
    }
    public void destruitePorNave(Nave nave){
    
    }
}
