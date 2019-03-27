/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ucpinvaders.Nave;

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
    public void validarDestruir(){
        
        Nave n = new Nave(100,50);
        Invasor i = new Invasor(100,25);
        int vida;
        vida=n.getVida();
        
        n.destruir(i);
        int valor;
        valor = ((n.getVelocidad() * i.getVelocidad())/100);
        vida = vida - valor;
        
        assertEquals(n.getVida(), vida);
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
