/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdastream;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andresbedoya
 */
public class BasicoTest {
    private Basico ejercicios = new Basico();
    
    public BasicoTest() {
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

    /**
     * Test of ejercicio1 method, of class Basico.
     */
    @Test
    public void testEjercicio1() {
        System.out.println("ejercicio1");
        List<String> listado = Arrays.asList("Andres", "Bedoya", "y", "Paez");
        List<String> resultado = ejercicios.ejercicio1(listado);
        assertEquals(Arrays.asList("ANDRES", "BEDOYA", "Y", "PAEZ"), resultado);
    }

    /**
     * Test of ejercicio2 method, of class Basico.
     */
    @Test
    public void testEjercicio2() {
        System.out.println("ejercicio2");
      List<String> listado = Arrays.asList(
                "A la una", "De eso tan bueno no dan tanto", "Hoy no fío mañana sí", "A las dos", "Más vale pájaro en mano que cien volando", "Entre menos sepa mejor vivo", "La vejez al que no lo mata lo desfigura", "y", "A las tres", "La plata se va y el burro queda");
        List<String> resultado = ejercicios.ejercicio2(listado);
        assertEquals(Arrays.asList(
                "De eso tan bueno no dan tanto", "Hoy no fío mañana sí", "Más vale pájaro en mano que cien volando", "Entre menos sepa mejor vivo", "La vejez al que no lo mata lo desfigura", "La plata se va y el burro queda"), resultado);
    }

    /**
     * Test of ejercicio3 method, of class Basico.
     */
    @Test
    public void testEjercicio3() {
        System.out.println("ejercicio3");
        List<String> listado = Arrays.asList(
                "Aprende", "a", "usar", "lambdas", "y Streams", "de", "Java 8");
        String resultado = ejercicios.ejercicio3(listado);
        assertEquals("usar-lambdas-y Streams", resultado);
    }

    /**
     * Test of ejercicio4 method, of class Basico.
     */
    @Test
    public void testEjercicio4() {
        System.out.println("ejercicio4");
       List<String> listado = Arrays.asList("10", "100", "20", "01", "22", "11", "5");
        List<Integer> resultado = ejercicios.ejercicio4(listado);
        assertEquals(Arrays.asList(1, 5, 10, 11, 20, 22, 100), resultado);
    }

    /**
     * Test of ejercicio5 method, of class Basico.
     */
    @Test
    public void testEjercicio5() {
        System.out.println("ejercicio5");
        List<String> listado = Arrays.asList(
                "Érase", "una", "vez", "unos", "desarrolladores", "que", "querían", "aprender", "lambdas", "y", "la", "API", "Stream");
        List<String> resultado = ejercicios.ejercicio5(listado);
        assertEquals(Arrays.asList("y", "la", "API", "que", "una", "vez", "unos", "Érase", "Stream", "lambdas", "querían", "aprender", "desarrolladores"), resultado);
    }
    
}
