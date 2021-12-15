package junit;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest extends TestCase {

    Calculadora calculadoraTest;

    @Before
    public void before(){
        // configurar las pre-condiciones del test
        calculadoraTest = new Calculadora();
        System.out.println("before()");
    }

    @Test
    public void testSum(){
        System.out.println("testSum()");
        int resultado = calculadoraTest.add(3,2);
        int resultadoEsperado = 5;
        assertEquals(resultado,resultadoEsperado);

    }

    @Test
    public void testAnsSum(){
        System.out.println("testAnsSum()");
        Calculadora calculadoraTest = new Calculadora();
        //valores de prueba
        int resultado = calculadoraTest.add(3,2);
        int resultadoEsperado = 5;
        assertEquals(resultado,resultadoEsperado);

    }

    @Test
    public void testSub(){
        Calculadora calculadoraTest = new Calculadora();
        //valores de prueba
        int resultado = calculadoraTest.add(3,2);
        int resultadoEsperado = 5;
        assertEquals(resultado,resultadoEsperado);

    }

}