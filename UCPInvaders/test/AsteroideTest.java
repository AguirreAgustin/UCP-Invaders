/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ucpinvaders.Asteroide;
import ucpinvaders.Invasor;
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
public class AsteroideTest {
    
    public AsteroideTest() {
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
        Nave n = new Nave (100,80);
        Asteroide a = new Asteroide(100);
        int vida = n.getVida();
        a.chocarNave(n);
        int valor = (n.getVelocidad()*a.getVelocidad())/200;
        vida = vida - valor;
        assertEquals(n.getVida(), vida);
         
    }
    @Test
    public void validarChocarInvasor(){
        
        Invasor i = new Invasor (100,80);
        Asteroide a = new Asteroide(100);
        int vida = i.getVida();
        a.chocarInvasor(i);
        int valor = (a.getVelocidad()*i.getVelocidad())/200;
        vida = vida - valor;
        assertEquals(i.getVida(), vida);
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
