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
public class Asteroide extends Artefacto{
   
    
    public Asteroide(int pVelocidad){
        
        super(pVelocidad);
        
    }
    
    
    /*
    public void chocarNave(Nave pNave){
        int vida = pNave.getVida();
        int valor = (pNave.getVelocidad()*this.getVelocidad())/200;
        vida = vida - valor;
        pNave.chocate(vida);
    
    }
    
    public void chocarInvasor(Invasor pInvasor){
        int vida = pInvasor.getVida();
        int valor = (pInvasor.getVelocidad()*this.getVelocidad())/200;
        vida = vida - valor;
        pInvasor.setVida(vida);
        
    
    }*/

    
    public void chocate() {
  
    }
    
    
    public void chocar(IChocable victima){
        victima.chocate((this.getVelocidad()*2)/(this.getVelocidad()/100));
    }
}
