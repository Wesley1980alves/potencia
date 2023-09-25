
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * @author Wesley
 */
public class PotenciaTest {

    public PotenciaTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of potencia method, of class Potencia.
     */
    @Test
    public void testPotencia() {
        Potencia calculadora = new Potencia();
        int resultado = calculadora.potencia(2, 2);
        int esperado = 4;
        assertTrue(resultado == esperado);
    }

}
