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

    

    
    
    
    
    public void destruir(Personaje personaje){
       /* if (personaje instanceof Invasor){
            int vida = personaje.getVida();
            int valor = (this.getVelocidad()* personaje.getVelocidad())/100;
            vida = vida - valor;
            personaje.setVida(vida);
        
        }else if(personaje instanceof InvasorVikingo){
            int vida = personaje.getVida();
            int valor = (this.getVelocidad()*10)/100;
            vida = vida - valor;
            personaje.setVida(vida);
            
        }else{
        }*/
        
        personaje.destruitePorNave(this);
        
    }
    
}
