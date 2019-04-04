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
public class InvasorVikingo extends Personaje{
    public InvasorVikingo(int pVida,int pVelocidad){
    
        super(pVida,pVelocidad);
        
        
    }
    @Override
    public void chocar(IChocable victima){
        
        victima.chocate((this.getVelocidad()*90)/100);
    }
    /*
    public void chocarNave(Nave nave){
        
        int valor = (90*this.getVelocidad())/100;
        int vida = nave.getVida() - valor;
        nave.chocate(vida);
    }*/
    
    public void destruitePorNave(Nave nave){
        int vida = this.getVida();
        int valor = (nave.getVelocidad()*10)/100;
        vida = vida - valor;
        this.setVida(vida);
    }
}
