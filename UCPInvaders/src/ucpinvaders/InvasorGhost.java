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
public class InvasorGhost {
    private int velocidad;
    private int vida;
    
    public InvasorGhost(int pVida,int pVelocidad){
    
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
    
    public void chocarNave(Nave pNave){
        
    }
    public void destruirNave(Nave pNave){
        
        int vida = pNave.getVida();
        
        int valor = (this.getVelocidad()*20)/100;
        vida = vida - valor;
        pNave.setVida(vida);
    }
}