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
public class Nave {
    
    private int velocidad;
    private int vida;
    
    public Nave(int pVida,int pVelocidad){
    
        this.setVida(pVida);
        
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
        int vida = this.getVida();
        int valor = (this.getVelocidad()* invasor.getVelocidad())/100;
        vida = vida - valor;
        this.setVida(vida);
        
    }
    
}
