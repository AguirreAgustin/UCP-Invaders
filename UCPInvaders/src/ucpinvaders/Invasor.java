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
public class Invasor extends Artefacto{
    
    private int vida;
    
    public Invasor(int pVida,int pVelocidad){
        
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
    
    public void chocarNave(Nave pNave){
        pNave.setVida(0);
    }
    public void destruirNave(Nave pNave){
        
        int vida = pNave.getVida();
        
        int valor = (this.getVelocidad()*20)/100;
        vida = vida - valor;
        pNave.setVida(vida);
    }
    
}
