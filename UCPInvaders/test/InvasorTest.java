/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ucpinvaders.Invasor;
import ucpinvaders.InvasorGhost;
import ucpinvaders.Nave;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Agustin
 */
public class InvasorTest {
    
    public InvasorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void validarChocarNave(){

        Nave nave = new Nave(100,100);
        Invasor invasor =  new Invasor (100, 100);
        invasor.chocar(nave);
        
        assertEquals(nave.getVida(),0);
    }
    
    @Test
    public void validarDestruirNave(){
        Nave nave = new Nave(100,100);
        Invasor invasor =  new Invasor (100, 50);
        int vida = nave.getVida();
        
        invasor.destruirNave(nave);
        int valor = (invasor.getVelocidad()*20)/100;
        vida = vida - valor;
        assertEquals(nave.getVida(), vida);
    }
    
    @Test
    public void validarDestruirGhostNave(){
        Nave nave = new Nave(100,100);
        InvasorGhost invasorG =  new InvasorGhost (100, 50);
        int vida = nave.getVida();
        
        invasorG.destruirNave(nave);
        int valor = (invasorG.getVelocidad()*20)/100;
        vida = vida - valor;
        assertEquals(nave.getVida(), vida);
    }
    @Test
    public void validarChocarGhostNave(){

        Nave nave = new Nave(100,100);
        InvasorGhost invasorG =  new InvasorGhost (100, 100);
        int vida = nave.getVida();
        invasorG.chocar(nave);
        
        assertEquals(nave.getVida(),vida);
    }
    @Test
    public void validarChocarGhostNave2(){

        Nave nave = new Nave(55,100);
        InvasorGhost invasorG =  new InvasorGhost (100, 100);
        int vida = nave.getVida();
        invasorG.chocar(nave);
        
        assertEquals(nave.getVida(),vida);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
