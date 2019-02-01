import static org.junit.Assert.*;

public class CalculadoraTest {

    @org.junit.Test
    public double dividir() {
        Double a = 3;
        Double b = 23;
        return (a / b);
    }
    @org.junit.Test
    public double multiplicar() {
        Double a = 3;
        Double b = 23;
        return (a*b);
    }

    @org.junit.Test
    public double restar() {
        Double a = 3;
        Double b = 23;
        return (a-b);
    }

    @org.junit.Test
    public double sumar() {
        Double a = 3;
        Double b = 23;
        return (a+b);
    }
}