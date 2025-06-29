package curso.es;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_sumar_numeros_positivos() {
        double devuelto = App.sumar(1, 5);
        Assert.assertEquals(6.0, devuelto, 0);
    }

    @Test
    public void test_sumar_numeros_negativos() {
        double devuelto = App.sumar(-1, -5);
        Assert.assertEquals(-6.0, devuelto, 0);
    }

    @Test
    public void test_sumar_numeros_mixtos() {
        double devuelto = App.sumar(1, -5);
        Assert.assertEquals(-4.0, devuelto, 0);
    }

    @Test
    public void test_sumar_numeros_con_cero() {
        double devuelto = App.sumar(1, 0);
        Assert.assertEquals(1.0, devuelto, 0);
    }

    @Test
    public void test_doblar_numeros_positivos() {
        double devuelto = App.doblar(5);
        Assert.assertEquals(10.0, devuelto, 0);
    }

    @Test
    public void test_doblar_numeros_negativos() {
        double devuelto = App.doblar(-1);
        Assert.assertEquals(-2.0, devuelto, 0);
    }

    @Test
    public void test_doblar_cero() {
        double devuelto = App.doblar(0);
        Assert.assertEquals(0.0, devuelto, 0);
    }
    @Test
    public void test_mitad() {
        double devuelto = App.mitad(16);
        Assert.assertEquals(8.0, devuelto, 0);
    }
    @Test
    public void test_triplar() {
        double devuelto = App.triplar(5);
        Assert.assertEquals(15.0, devuelto, 0);
    }

    

}
