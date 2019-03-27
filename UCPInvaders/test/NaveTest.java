/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ucpinvaders.Nave;
import ucpinvaders.InvasorGhost;
import ucpinvaders.Invasor;
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
public class NaveTest {
    
    public NaveTest() {
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
    public void validarDestruir85(){
        
        Nave n = new Nave(100,50);
        Invasor i = new Invasor(100,25);
        int vida;
        vida=i.getVida();
        
        n.destruir(i);
        int valor;
        valor = ((n.getVelocidad() * i.getVelocidad())/100);
        vida = vida - valor;
        
        assertEquals(i.getVida(), vida);
        
    }
    @Test
    public void validarDestruir100(){
        
        Nave n = new Nave(100,0);
        Invasor i = new Invasor(100,0);
        
    
        
        n.destruir(i);
        
        
        assertEquals(i.getVida(), 100);
        
    }
    @Test
    public void validarDestruir0(){
        
        Nave n = new Nave(100,100);
        Invasor i = new Invasor(100,100);
       
        
        n.destruir(i);
        
        
        assertEquals(i.getVida(), 0);
        
    }
    @Test
    public void validarDestruirGhost(){
        
        InvasorGhost iG = new InvasorGhost(100,25);
        Nave n = new Nave(100,50);
        int vida = iG.getVida();
        n.destruirGhost(iG);
        
        assertEquals(iG.getVida(), vida);
    }
    @Test
    public void validarDestruirGhost2(){
        
        InvasorGhost iG = new InvasorGhost(50,25);
        Nave n = new Nave(50,50);
        int vida = iG.getVida();
        n.destruirGhost(iG);
        
        assertEquals(iG.getVida(), vida);
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
