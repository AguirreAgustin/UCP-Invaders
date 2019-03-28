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
public class Personaje extends Artefacto{
    private int vida;
    
    public Personaje(int vida, int velocidad){
        super(velocidad);
        this.setVida(vida);
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
    public void destruitePorNave(Nave nave){
    
    }
}
