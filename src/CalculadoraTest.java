import static org.junit.Assert.*;

public class CalculadoraTest {

    @org.junit.Test
    public void dividir() {
        Calculadora calculadora = new Calculadora();
        Double a = 4.0;
        Double b = 2.0;
        assertEquals( 2.0, calculadora.dividir(a,b), 0.0);

    }

    @org.junit.Test
    public void multiplicar() {
    }

    @org.junit.Test
    public void restar() {
    }

    @org.junit.Test
    public void sumar() {
    }
}