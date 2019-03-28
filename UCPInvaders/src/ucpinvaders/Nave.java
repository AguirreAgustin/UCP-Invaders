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
public class Nave extends Artefacto{
    
    
    private int vida;
    
    public Nave(int pVida,int pVelocidad){
        super(pVelocidad);
        this.setVida(pVida);
        
        
        
        
    }

    

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    
    public void destruir(Invasor invasor){
        int vida = invasor.getVida();
        int valor = (this.getVelocidad()* invasor.getVelocidad())/100;
        vida = vida - valor;
        invasor.setVida(vida);
        
    }
    public void destruir(InvasorGhost invasor){
        
    }
    public void destruirGhost(InvasorGhost iG){
        
    }
}
